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
	private LocalDate companycreateDate;
	@CreationTimestamp
	private LocalDate companyupdateDate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getCompanyPassword() {
		return companyPassword;
	}
	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyAddr() {
		return companyAddr;
	}
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	public String getCompanyPhone() {
		return companyPhone;
	}
	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}
	public String getCompanyCorporate() {
		return companyCorporate;
	}
	public void setCompanyCorporate(String companyCorporate) {
		this.companyCorporate = companyCorporate;
	}
	public LocalDate getCompanycreateDate() {
		return companycreateDate;
	}
	public void setCompanycreateDate(LocalDate companycreateDate) {
		this.companycreateDate = companycreateDate;
	}
	public LocalDate getCompanyupdateDate() {
		return companyupdateDate;
	}
	public void setCompanyupdateDate(LocalDate companyupdateDate) {
		this.companyupdateDate = companyupdateDate;
	}

}
