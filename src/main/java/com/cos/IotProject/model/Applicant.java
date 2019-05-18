package com.cos.IotProject.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data//겟터셋터
public class Applicant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //기본키설정
	private int num;

	private String applicantID;
	private String applicantPassword;
	private String applicantName;
	private String applicantEmail;
	private String applicantAddr;
	private String applicantPhone;
	private String applicantRRN; // 주민등록번호
	private String applicantGender;
	private int applicantAge;
	
	@CreationTimestamp
	private LocalDate applicantcreateDate;
	@CreationTimestamp
	private LocalDate applicantupdateDate;
}
