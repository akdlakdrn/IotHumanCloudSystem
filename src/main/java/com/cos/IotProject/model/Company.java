package com.cos.IotProject.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Company {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)//시퀀스 같은거
	private int num;
	
	private String companyID;
	private String companyPassword;
	private String companyName;
	private String companyEmail;
	private String companyAddr;
	private String companyPhone;
	private String companyCorporate;//사업자등록번호
	
	@CreationTimestamp
	private LocalDate applicantcreateDate;
	@CreationTimestamp
	private LocalDate applicantupdateDate;

}
