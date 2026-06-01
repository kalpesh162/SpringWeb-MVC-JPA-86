package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.StudentDao;
import com.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao dao;
	
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
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("stud")Student student) {
		System.out.println(student);
		// save to db
		int noOfRecords=dao.saveStudent(student);
		
		if(noOfRecords<0)
			return "error";
		
		return "display";
	}
	
}
