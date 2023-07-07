package com.ak.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import com.ak.service.ILinksService;
import com.ak.service.LinksServiceImpl;

public class LinksHandler {

	private ILinksService service;

	public LinksHandler() {
		service = new LinksServiceImpl();
	}

	// Handler Method1
	public String showWishMessage(HttpServletRequest req) {
		// Use Service
		String resultMsg = service.generateWishMessage();

		// Keep the result in request scope
		req.setAttribute("wmsg", resultMsg);

		// return Logical View name(LVN) based on which jsp file name and location will
		// be decided
		return "wish_result";
	}
	
	// Handler Method2
		public String showAllMessage(HttpServletRequest req) {
			// Use Service
			Set<String> langsSet = service.fetchAllLanguages();

			// Keep the result in request scope
			req.setAttribute("langInfo", langsSet);

			// return Logical View name(LVN) based on which jsp file name and location will
			// be decided
			return "all_lang";
		}
}
