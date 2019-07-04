package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.bean.Ansbean;
import com.example.demo.bean.Point;
import com.example.demo.bean.Quebean;
import com.example.demo.bean.Registerbean;
import com.example.demo.repository.AnsupdateRepository;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.Myrepo;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.repository.insertpoint;

@Service
public class Displayservice {

	@Autowired
	Myrepo repo;
	@Autowired
	insertpoint up;
	@Autowired
	QuestionRepository qrepo;
	@Autowired
	AnswerRepository arepo;
	@Autowired
	AnsupdateRepository urepo;
	@Transactional
	public Iterable<Registerbean> findAll() {
		return repo.findAll();
	}

	@Transactional
	public Iterable<Quebean> findAllque() {
		return qrepo.findAll();
	}

	public  Optional<Quebean> findQuestionById(Long qId) {
		return qrepo.findById(qId);
		
	}
	public  Optional<Ansbean> findQuestionid(Long aId) {
		return arepo.findById(aId);
		
	}
	
	public List<Ansbean> checkans(Long id) {		
		return arepo.find(id);	
		
	}
	public Quebean findlogin(Long id) {		
		return qrepo.finduid(id);	
		
	}
	@Transactional
	public int ansupdate(Long id) {		
		return urepo.updateAddress(id);	
		
	}
	@Transactional
	public int pointupdate(Long id) {		
		return urepo.updatepoint(id);	
		
	}
	@Transactional
	public  Point findbypointid(Long aId) {
		return up.find1(aId);
		
	}
	@Transactional
	public  Point ridcheck(Long rId) {
		return up.rid(rId);
		
	}


}