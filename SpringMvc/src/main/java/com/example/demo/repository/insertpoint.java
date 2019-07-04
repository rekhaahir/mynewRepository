package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.Point;
import com.example.demo.bean.Quebean;

public interface insertpoint  extends CrudRepository<Point, Long> {
	
	 @Query("Select p from Point p where p.ab.aid=:ID")
		public Point find1(@Param("ID")long id);
	 @Query("Select p from Point p where p.rb.id=:ID")
		public Point rid(@Param("ID")long id);
	
	 
//	@Modifying
//	    @Query(value = "insert into points (ab_aid,rb_id,qbid_qid) VALUES (:id,:id1,:id2)", nativeQuery = true)
//	 public int modifyingQueryInsert(@Param("id")Long aid, @Param("id1")Long rid, @Param("id2")Long id2);
}
//@Query("insert into Person (id,name,age) select :id,:name,:age from Dual")
//public int modifyingQueryInsertPerson(@Param("id")Long id, @Param("name")String name, @Param("age")Integer age);
