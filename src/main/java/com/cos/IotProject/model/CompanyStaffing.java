package com.cos.IotProject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class CompanyStaffing {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)//시퀀스 같은거
	private int num;
	
	@Column(nullable = false, length =100)//null이 되면 안된다.
	private String companyTitle;

	@ManyToOne
	@JoinColumn(name="companyId")
	private Applicant companyId;
	@ManyToOne
	@JoinColumn(name="addressId")
	private Address addressId;//데이터 들고와야됨 너도조인하자
	
	private int salaryId;//데이터 들고와야됨 너도조인하세요
	@ManyToOne
	@JoinColumn(name="educationId")
	private Education educationId;//데이터 들고와야됨 너도조인하세요
	@ManyToOne
	@JoinColumn(name="jobId")
	private Job jobId;//데이터 들고와야됨 너도 조인 하세요
	
	@Lob
	@Column(nullable = false, length = 60000)//글자는 넉넉하게
	private String companyStaffingContent;
	@Lob
	@Column(length = 1024)
	private byte[] image;

}
