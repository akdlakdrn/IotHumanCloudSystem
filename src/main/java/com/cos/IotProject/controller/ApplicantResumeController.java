package com.cos.IotProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.IotProject.model.ApplicantResume;
import com.cos.IotProject.service.ApplicantResumeService;

@Controller
@RequestMapping("/applicantresume")
public class ApplicantResumeController {
	
	@Autowired
	private ApplicantResumeService applicantresumeservice;
	
	@GetMapping("/app/list")
	public @ResponseBody List<ApplicantResume> findAll(){
		return applicantresumeservice.findAll();
	}
	
	
	@GetMapping("/list")
	public String findAll(Model model) {
		model.addAttribute("applicantresumes", applicantresumeservice.findAll());
		return "applicantResume";
	}
	
	@GetMapping("/join")
	public String join() {
		return "applicantresumecreate";
	}
	
	@PostMapping("/create")
	public ApplicantResume create(@RequestBody ApplicantResume applicantResume) {
		
		Optional<ApplicantResume> optionalApplicantResume = Optional.ofNullable(applicantResume);
		System.out.println(optionalApplicantResume);
		System.out.println(optionalApplicantResume.isPresent());
		ApplicantResume result = applicantresumeservice.create(optionalApplicantResume);
		return result;
	}
	
	
	@PostMapping("/update")
	public String update(ApplicantResume applicantResume) {
		Optional<ApplicantResume> optionalApplicantResume = Optional.ofNullable(applicantResume);
		System.out.println(optionalApplicantResume);
		System.out.println(optionalApplicantResume.isPresent());
	      ApplicantResume result = applicantresumeservice.create(optionalApplicantResume);
	      System.out.println(result);
		return "redirect:list";
	}
	
	@PostMapping("/delete")
	public @ResponseBody String delete(int num) {
		int result = applicantresumeservice.delete(num);
		if(result == 1) {
			return "정상적으로 삭제됨";
		}else {
			return "삭제중 오류가 발생함";
		}
	}
	
	//http://localhost:8000/board/2
	@GetMapping("/{num}")
	public String applicantResumeDetail(@PathVariable int num, Model model) {
		Optional<ApplicantResume> temp = applicantresumeservice.applicantResumeDetail(num);
		//숙제 널처리하기(Optional)
		//ispresent()
		
		if(temp.isPresent()) {
			ApplicantResume applicantResume = temp.get();
			model.addAttribute("applicantResume",applicantResume);
			System.out.println("applicantResumedetail");
			return "applicantResumedetail";
		}else {
			System.out.println("applicantResumedetail");
			return "applicantResumedetail";
		}
	}

}
