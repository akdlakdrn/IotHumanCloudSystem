package com.cos.IotProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.IotProject.model.Applicant;
import com.cos.IotProject.service.ApplicantService;



@Controller
@RequestMapping("/applicant")
public class ApplicantController {

	
	@Autowired
	private ApplicantService applicantService;
	
	
	@GetMapping("/app/list")//앱에서받을 목록 JSON형식의 리스트
	public @ResponseBody List<Applicant> testfindAll() {
		return applicantService.findAll();
	}
	
	@GetMapping("/list")//지원자의 목록리스트
	public String findAll(Model model) {
		model.addAttribute("applicants", applicantService.findAll());// 현재는 자바객체
		return "applicant";
	}
	
	@PostMapping("/create")//포스트맵핑을 이용하여 DB에담기위한 방식
	public String create(Applicant applicant) {
		applicantService.create(applicant);
		return "redirect:list";
	}
	
	@PostMapping("/update")//포스트맵핑을 이용하여 수정하기위한 맵핑
	public String update(Applicant applicant) {
		applicantService.create(applicant);
		return "redirect:list";
	}
	
	@PostMapping("/delete")//정보삭제를 위해 사용하는 부분
	public @ResponseBody String delete(int num) {
		int result = applicantService.delete(num);
		if(result == 1) {
			return "정상적으로 삭제됨";
		}else {
			return "삭제중 오류가 발생함";
		}
	}
	
	@GetMapping("/{num}")//자신의 정보를 호출하기 위한 부분
	public String applicantupDetail(@PathVariable int num, Model model) {
		Optional<Applicant> temp = applicantService.applicantDetail(num);
		//숙제 널처리하기(Optional)
		//ispresent()
		
		if(temp.isPresent()) {
			Applicant applicant = temp.get();
			model.addAttribute("applicant",applicant);
			System.out.println("applicantupdate");
			return "applicantupdate";
		}else {
			System.out.println("applicantupdateerror");
			return "applicantupdateerror";
		}
	}
	
	
	
}
