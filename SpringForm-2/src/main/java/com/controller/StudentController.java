package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/welcome")
	public String welcomePage() {
		return "index";
	}
	
	@RequestMapping("/open")
	public String openForm(Model model) {
		model.addAttribute("stud", new Student());
		return "studform";
	}
	
	@RequestMapping(value = "/show",method = RequestMethod.POST)
	public String displatStudent(@ModelAttribute("stud") Student student) {
		
		return "display";
	}
	
}
