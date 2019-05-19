package com.cos.IotProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.IotProject.model.Company;
import com.cos.IotProject.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public Company create(Company company) {
		//findAll(),findByid(),save(),delete()
		return companyRepository.save(company);
	}
	
	public List<Company> findAll() {
		return companyRepository.findAll();
	}
	
	public Optional<Company> findById(int num){
		return companyRepository.findById(num);
	}
	
	//jsp 삭제 -> primary key
	//spring - > entity - > board
	//spring - > id
	public int delete(int num) {
//		boardRepository.delete(entity);
		try {
			companyRepository.deleteById(num);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public Optional<Company> detail(int num) {
		return companyRepository.findById(num);
	}
	

}
