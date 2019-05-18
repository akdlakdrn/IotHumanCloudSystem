package com.cos.IotProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class CompanyReview {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)//시퀀스 같은거
	private int num;
	@ManyToOne
	@JoinColumn(name="CompanyId")
	private Company companyId;
	private String companyReviewContents;
	private int companyReviewLike;

}
