package com.cos.IotProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.IotProject.model.Applicant;
import com.cos.IotProject.service.ApplicantService;



@Controller
@RequestMapping("/applicant")
public class ApplicantController {

	
	@Autowired
	private ApplicantService applicantService;
	
	
	@GetMapping("/app/list")
	public @ResponseBody List<Applicant> testfindAll() {
		return applicantService.findAll();
	}
	
	@GetMapping("/list")
	public String findAll(Model model) {
		model.addAttribute("applicants", applicantService.findAll());// 현재는 자바객체
		return "applicant";
	}
	
	
	
}
