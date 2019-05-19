package com.cos.IotProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.IotProject.model.Applicant;
import com.cos.IotProject.model.ApplicantReview;
import com.cos.IotProject.repository.ApplicantRepository;
import com.cos.IotProject.repository.ApplicantReviewRepository;

@Service
public class ApplicantReviewService {
	
	@Autowired
	private ApplicantReviewRepository applicantReviewRepository;
	


	
}
