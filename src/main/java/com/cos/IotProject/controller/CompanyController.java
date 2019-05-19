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

import com.cos.IotProject.model.Company;
import com.cos.IotProject.service.CompanyService;

@Controller
@RequestMapping("company")
public class CompanyController {
		
		@Autowired // 호출
		private CompanyService companyService;
		
		@GetMapping("/app/list")
		public @ResponseBody List<Company> testfindAll() {
			System.out.println(companyService.findAll());
			return companyService.findAll();
		}
		@GetMapping("/")
		public String home() {
			
			return "redirect:list";
		}
		

		// model == request랑 같은거
		@GetMapping("/list")
		public String findAll(Model model) {
			model.addAttribute("companys", companyService.findAll());// 현재는 자바객체
			return "company";
		}

		// ResponseBody -> messageConvertor(jackson bind)
		// RequestBody - > messageConvertor(Jackson bind)--json데이터를 받을때
		// RequestBody가 없으면 x-www-form-urlendode를 파싱
		// RequestBody가 없으면 text를 파싱
		// RequestBody가 없으면 multipart 데이터 이미지 , 영상 -form-data
		@GetMapping("/join")
			public String join() {
			return "companyjoin";
		}
		
		@PostMapping("/create")
		public String create(Company company) {
			companyService.create(company);
			return "company";
		}
		
		@PostMapping("/delete")
		public @ResponseBody String delete(int num) {
			int result = companyService.delete(num);
			if(result == 1) {
				return "정상적으로 삭제됨";
			}else {
				return "삭제중 오류가 발생함";
			}
		}
		
		//http://localhost:8000/board/2
		@GetMapping("/{num}")
		public String detail(@PathVariable int num, Model model) {
			Optional<Company> temp = companyService.detail(num);
			//숙제 널처리하기(Optional)
			//ispresent()
			
			if(temp.isPresent()) {
				Company company = temp.get();
				model.addAttribute("companys",company);
				System.out.println("detail");
				return "detail";
			}else {
				System.out.println("error");
				return "error";
			}
		}
}
