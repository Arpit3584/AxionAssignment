package com.accionLabls.Assignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accionLabls.Assignment.Entity.Student;
import com.accionLabls.Assignment.Service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ReportController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/report-card/{name}")
	public Student getReportCard(@PathVariable String name) {
		return studentService.getReportCard(name);
	}

	@GetMapping("/awarded-students")
	    public List<Student> getAwardedStudents(@RequestParam String subject, @RequestParam int percentage) {
	        return studentService.getAwardedStudents(subject, percentage);
	        
	
	
	
	
}
	}
