package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("marks") double marks, Model model) {
		
		model.addAttribute("studid", id);
		model.addAttribute("studname", name);
		model.addAttribute("studmarks", marks);

		return "display";
	}

}
