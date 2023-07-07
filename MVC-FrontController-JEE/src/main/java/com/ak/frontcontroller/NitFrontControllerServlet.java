package com.ak.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ak.controller.LinksHandler;

@WebServlet("/")
public class NitFrontControllerServlet extends HttpServlet {
	private static final long serialVersionUID = -6900525997833868445L;
	private LinksHandler handler = null;

	@Override
	public void init() throws ServletException {
		handler = new LinksHandler();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("NitFrontControllerServlet()::" + req.getServletPath());

		// Navigation Management
		String Inv = null;
		if (req.getServletPath().equalsIgnoreCase("/wish")) {
			Inv = handler.showWishMessage(req);
		} else if (req.getServletPath().equalsIgnoreCase("/lang")) {
			Inv = handler.showAllMessage(req);
		} else {
			Inv = "Home";
		}

		// View Management
		String destPage = null;
		if (Inv.equalsIgnoreCase("wish_result")) {
			destPage = "/show_wish.jsp";
		} else if (Inv.equalsIgnoreCase("all_lang")) {
			destPage = "/show_languages.jsp";
		} else {
			destPage = "/index.jsp";
		}

		// Forward the Request to dest Page
		RequestDispatcher rd = req.getRequestDispatcher(destPage);
		rd.forward(req, resp);
	}
}
