package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;

@Controller
public class StudentController {
    // http://localhost:8080/SpringMVCStudApp-1/
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping("/open")
	public String openForm(Model model) {
		
		model.addAttribute("stud", new Student());
		return "studform";
	}
	
}
