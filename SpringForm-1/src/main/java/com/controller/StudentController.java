package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bean.Student;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String welcomePage() {
		return "index";
	}

	@RequestMapping("/open")
	public String openForm(Model model) {
		Student student=new Student();
		model.addAttribute("stud", student);
		return "studform";
	}

	
	
	@RequestMapping(value = "/show", method = RequestMethod.POST)
	public String showData(@ModelAttribute("stud")Student student) {
			//model.addAttribute("stud", student);
		System.out.println(student);
		return "display";
	}

}
