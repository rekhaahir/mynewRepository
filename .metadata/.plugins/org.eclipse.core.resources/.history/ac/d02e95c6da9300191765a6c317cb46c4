package com.example.demo.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.Registerbean;

public interface Myrepo extends CrudRepository<Registerbean, Long>{
	@Query("Select p from Registerbean p where p.userName=:Name")
	public Registerbean check(@Param("Name")String name);
}
