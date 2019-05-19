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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getApplicantID() {
		return applicantID;
	}
	public void setApplicantID(String applicantID) {
		this.applicantID = applicantID;
	}
	public String getApplicantPassword() {
		return applicantPassword;
	}
	public void setApplicantPassword(String applicantPassword) {
		this.applicantPassword = applicantPassword;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantAddr() {
		return applicantAddr;
	}
	public void setApplicantAddr(String applicantAddr) {
		this.applicantAddr = applicantAddr;
	}
	public String getApplicantPhone() {
		return applicantPhone;
	}
	public void setApplicantPhone(String applicantPhone) {
		this.applicantPhone = applicantPhone;
	}
	public String getApplicantRRN() {
		return applicantRRN;
	}
	public void setApplicantRRN(String applicantRRN) {
		this.applicantRRN = applicantRRN;
	}
	public String getApplicantGender() {
		return applicantGender;
	}
	public void setApplicantGender(String applicantGender) {
		this.applicantGender = applicantGender;
	}
	public int getApplicantAge() {
		return applicantAge;
	}
	public void setApplicantAge(int applicantAge) {
		this.applicantAge = applicantAge;
	}
	public LocalDate getApplicantcreateDate() {
		return applicantcreateDate;
	}
	public void setApplicantcreateDate(LocalDate applicantcreateDate) {
		this.applicantcreateDate = applicantcreateDate;
	}
	public LocalDate getApplicantupdateDate() {
		return applicantupdateDate;
	}
	public void setApplicantupdateDate(LocalDate applicantupdateDate) {
		this.applicantupdateDate = applicantupdateDate;
	}
	
	
}
