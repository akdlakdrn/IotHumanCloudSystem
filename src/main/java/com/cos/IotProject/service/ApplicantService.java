package com.cos.IotProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.IotProject.model.Applicant;
import com.cos.IotProject.repository.ApplicantRepository;

@Service
public class ApplicantService {
	
	@Autowired
	private ApplicantRepository applicantRepository;
	
	public Applicant create(Applicant applicant) {
		return applicantRepository.save(applicant);
	}
	
	public List<Applicant> findAll(){
		return applicantRepository.findAll();
	}
	
	public Optional<Applicant> findById(int num){
		return applicantRepository.findById(num);
	}
	
	public int delete(int num) {
//		boardRepository.delete(entity);
		try {
			applicantRepository.deleteById(num);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public Optional<Applicant> applicantDetail(int num) {
		return applicantRepository.findById(num);
	}

}
