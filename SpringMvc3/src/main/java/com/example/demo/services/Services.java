package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Ansbean;
import com.example.demo.bean.Quebean;
import com.example.demo.bean.Registerbean;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.repository.Myrepo;
import com.example.demo.repository.QuestionRepository;

@Service
public class Services {

	@Autowired
	Myrepo repo;
	@Autowired
	QuestionRepository qrp;
	@Autowired
	AnswerRepository arepo;

	public void insert(Registerbean obj) {
		repo.save(obj);
	}
	public void insertque(Quebean oj) {
		qrp.save(oj);
	}
	public void insertans(Ansbean oa) {
		arepo.save(oa);
	}
//	public boolean log(Registerbean user) {
//
//		Registerbean u=repo.findByName(user.getUserName(),user.getPassWord());
//		if(u!=null)
//			return true;
//		else
//			return false;
//		
//}
	
	public Registerbean checkLogin(String name) {
		// TODO Auto-generated method stub
		
		return repo.check(name);	
		
	}
}
