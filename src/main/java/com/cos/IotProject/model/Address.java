package com.cos.IotProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)//시퀀스 같은거
	private int num;
	private String city;
	private String borough;

}
