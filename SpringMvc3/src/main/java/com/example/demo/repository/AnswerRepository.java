package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.Ansbean;

public interface AnswerRepository extends CrudRepository<Ansbean, Long>{
	@Query("Select p from Ansbean p where p.qbid.qid=:ID")
	public List<Ansbean> find(@Param("ID")long id);
}
