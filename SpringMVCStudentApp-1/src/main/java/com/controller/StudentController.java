package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute("stud") Student student) {
		System.out.println(student);
		// save to db
		int noOfRecords = dao.saveStudent(student);

		if (noOfRecords < 0)
			return "error";

		// return "display"; // /read return "redirect:/read"
		return "redirect:/read";
	}

	@RequestMapping("/read")
	public String showAllStudents(Model model) {
		List<Student> list = dao.findAllStudents();
		model.addAttribute("studlist", list);
		System.out.println(list);
		return "records";
	}

	// http://localhost:8080/SpringMVCStudentApp-1/delete/2
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {

		int res = dao.deleteStudentById(id);

		if (res <= 0)
			return "error";

		return "redirect:/read";
	}

}
