package com.cos.IotProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.IotProject.model.ApplicantResume;
import com.cos.IotProject.repository.ApplicantResumeRepository;

@Service
public class ApplicantResumeService {

	@Autowired
	private ApplicantResumeRepository applicantResumeRepository;

	public ApplicantResume create(Optional<ApplicantResume> optionalApplicantResume) {
		System.out.println("11");
		if (optionalApplicantResume.isPresent()) {
			ApplicantResume applicantResume = optionalApplicantResume.get();
			System.out.println(applicantResume);
			return applicantResumeRepository.save(applicantResume);
		} else {
			System.out.println("fail");
			return null;
		}
	}

	public List<ApplicantResume> findAll() {
		return applicantResumeRepository.findAll();
	}

	public Optional<ApplicantResume> findById(int num) {
		return applicantResumeRepository.findById(num);
	}

	public int delete(int num) {
		try {
			applicantResumeRepository.deleteById(num);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public Optional<ApplicantResume> applicantResumeDetail(int num) {
		return applicantResumeRepository.findById(num);
	}

}
