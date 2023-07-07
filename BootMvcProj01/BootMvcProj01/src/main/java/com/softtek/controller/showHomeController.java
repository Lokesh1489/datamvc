package com.softtek.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class showHomeController {
//	@RequestMapping("/home")
//	public String showHome() {
//		//return lvn
//		return "welcome";
//	}

//	@RequestMapping("/")
//	public String launchHomePage() {
//		//return lvn
//		return "welcome";
//	}

//	@RequestMapping("/show_data")
//	public String process(Map<String, Object> map) {
//		System.out.println("ShowHomeController.process()::ShareMemory Object Class Name:" + map.getClass());
//		// Add model attributes to shared memory
//		map.put("attr1", "val1");
//		map.put("attr2", LocalDateTime.now());
//		// return LVN
//		return "show_data";
//	}
	
//	@RequestMapping("/process")
//	public ModelAndView process() {
//		//Create SharedMemory
//		ModelAndView mav=new ModelAndView();
//		//Add model attributes to shared Memory
//		mav.addObject("attr1","val1");
//		mav.addObject("sysDt",LocalDateTime.now());
//		//Place LVN to MAV object
//		mav.setViewName("process");
//		return mav;
//	}
	
	// Forward and Redirect
	@RequestMapping("/process")
	public String process() {
		System.out.println("ShowHomeController.process()");
		return "redirect:report";
	}
	
	@RequestMapping("/report")
	public String showReport() {
		System.out.println("ShowHomeController.showReport()");
		return "show_data";
	}
	
	
}
