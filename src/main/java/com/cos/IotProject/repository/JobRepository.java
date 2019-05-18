package com.cos.IotProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.IotProject.model.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{

}
