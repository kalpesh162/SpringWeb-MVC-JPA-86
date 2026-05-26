package com.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String welcomePage() {
		return "welcome";
	}
	
	@RequestMapping("/form")
	public String openForm() {
		return "studform";
	}
	
	@RequestMapping("/show")
	public String showData(HttpServletRequest request,Model model) {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		double marks=Double.parseDouble(request.getParameter("marks"));
		
		model.addAttribute("studid", id);
		model.addAttribute("studname", name);
		model.addAttribute("studmarks", marks);
		
		return"display";
	}
	
}
