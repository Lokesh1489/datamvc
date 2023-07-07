package com.ak.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ak.service.ISeasonFinderService;

@Controller
public class SeasonOperationsController {

	@Autowired
	private ISeasonFinderService service;

//	@RequestMapping("/")
//	public String showHome() {
//		return "welcome";
//	}
//
//	@RequestMapping("/season")
//	public String showSeason(Map<String, Object> map) {
//		// Use Service
//		String msg = service.findSeason();
//
//		// Keep the result in model Attributes
//		map.put("resultMsg", msg);
//
//		// Return LVN
//		return "display";
//	}
	
	@GetMapping("/report")
	public String sendData(Map<String, Object> map) {
		//Put Arrays,collection as the model attribute values
		map.put("favColors",new String[] {"Red","Green","Yellow"});
		map.put("nickNames",List.of("Raja","Raj","Maharaj"));
		map.put("phoneNumbers",Set.of(99999L,88888L,77777L));
		map.put("idDetails",Map.of("aadharNo",7889999,"voterId",654654654L));
		
		//return LVN
		return "show_report";
	}
}
