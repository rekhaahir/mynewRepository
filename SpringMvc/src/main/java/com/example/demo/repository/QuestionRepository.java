package com.example.demo.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.Ansbean;
import com.example.demo.bean.Quebean;


public interface QuestionRepository extends CrudRepository<Quebean, Long>{
	@Query("Select p from Quebean p where p.qid=:ID")
	public Quebean finduid(@Param("ID")long id);
	
	 
}
