package com.example.demo.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.Ansbean;
import com.example.demo.bean.Quebean;
import com.example.demo.bean.Registerbean;
import com.example.demo.services.Services;
import com.example.demo.services.Displayservice;

@Controller
public class Home {
	@Autowired
	Services sob;
	
	Quebean qobject=new Quebean();
	@Autowired
	Displayservice displayservice;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("Register");
		model.addObject("save", new Registerbean());
		return model;
	}

	@RequestMapping(value = { "/submitForm" }, method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("save") Registerbean ob) {

		sob.insert(ob);
		return new ModelAndView("redirect:/list");
	}

	@RequestMapping(value = { "/ask" }, method = RequestMethod.GET)
	public ModelAndView asking() {
		ModelAndView model = new ModelAndView("Questions");
		model.addObject("qadd", new Registerbean());
		return model;
	}

	@RequestMapping(value = { "/submitque" }, method = RequestMethod.POST)
	public ModelAndView ins1(@ModelAttribute("qadd") Quebean ob, HttpSession session) {
		long s2 = (long) session.getAttribute("id");
		System.out.println("s2" + "is" + s2);
		Registerbean rob = new Registerbean();
		rob.setId(s2);
		ob.setRb(rob);
		sob.insertque(ob);
		return new ModelAndView("welcome");
	}

	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("products", displayservice.findAll());
		return "success";
	}
	@RequestMapping(value = { "/ask1" }, method = RequestMethod.GET)
	public ModelAndView asking1(  Model model1,ModelMap mod) {
		ModelAndView model = new ModelAndView("Answer");
		model.addObject("aadd", new Registerbean());
		model1.addAttribute("testPath", qobject.getQue());	
		//displayservice.checkans(qobject.getQid());
		
		mod.put("anssshow", displayservice.checkans(qobject.getQid()));
//		System.out.println(qobject.getQid());
//		System.out.println(qobject.getQue());
		return model;
	}

	@RequestMapping(value = { "/ansins" }, method = RequestMethod.GET)
	public ModelAndView insans(@ModelAttribute("aadd") Ansbean oba, HttpSession session) {
	long s2 = (long) session.getAttribute("id");
	System.out.println("s2" + "is" + s2);
	Registerbean rob = new Registerbean();
	rob.setId(s2);
	oba.setRb(rob);	
	Quebean qid=new Quebean();
	qobject.getQid();
	
	System.out.println("ses"+session.getAttribute("qid"));
	
	oba.setQbid(qobject);
	System.out.println(oba.getAns());
	sob.insertans(oba);
	return new ModelAndView("welcome");
	}
	
	
	@RequestMapping(value = "/test/{qId}", method = RequestMethod.GET)
	public ModelAndView ss(@PathVariable("qId") Long qId, Model model,HttpSession session) {
		System.out.println(qId);

		session.setAttribute("qid", qId);
		Optional<Quebean> questionBean=displayservice.findQuestionById(qId);
		
		if(questionBean.isPresent()) {
			model.addAttribute("testPath", questionBean.get().getQue());	
			
			qobject.setQue(questionBean.get().getQue());
			
		
		}qobject.setQid(qId);
		
//		ModelAndView model1 = new ModelAndView("Answer");
//		model1.addObject("aadd", new Registerbean());
//		return model1;
	
	return new ModelAndView("redirect:/ask1");
//		
	}
//	@RequestMapping(value = "/test/{qId}", method = RequestMethod.GET)
//	public ModelAndView Controller(@PathVariable("qId") Long qId, Model model) {
//		System.out.println(qId);
//		Optional<Quebean> questionBean=displayservice.findQuestionById(qId);
//		if(questionBean.isPresent()) {
//			model.addAttribute("testPath", questionBean.get().getQue());	
//		}
//		ModelAndView model1 = new ModelAndView("Answer");
//		model1.addObject("aadd", new Registerbean());
//		return new ModelAndView("Answer");
//		
//	}
//	@RequestMapping(value = { "/ansins" },method = RequestMethod.GET)
//	public ModelAndView insans(@ModelAttribute("aadd") Ansbean oba, HttpSession session) {
////		long s2 = (long) session.getAttribute("id");
////		System.out.println("s2" + "is" + s2);
////		Registerbean rob = new Registerbean();
////		rob.setId(s2);
////		oba.setRb(rob);	
////		Quebean qid=new Quebean();
////		qid.setQid((long) 4);
////		System.out.println("qid"+qid.getQid());
////
////		
////		
////		Registerbean rid=new Registerbean();
////		rid.setId((long) 5);
////		System.out.println("rid"+rid.getId());
////		oba.setQbid(qid);
////		oba.setRb(rid);
////		System.out.println(oba.getAns());
////		//oba.setAns("this");
////		sob.insertans(oba);
//		return new ModelAndView("index");
//	}
	@RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public ModelAndView authentication(@ModelAttribute("vo") Registerbean VO, HttpSession session, ModelMap modelMap1) {
		ModelAndView mv = new ModelAndView();
		String name = VO.getUserName();


		Registerbean VO1 = sob.checkLogin(name);

		if (VO1.getPassWord().equals(VO.getPassWord())) {

			long id = VO1.getId();
			String name1 = VO.getUserName();
			System.out.println(id);
			ModelMap model = new ModelMap();
			model.put("name2", name1);
			long lid = VO1.getId();
			System.out.println("my id" + lid);
			session.setAttribute("id", lid);
			long s = (long) session.getAttribute("id");

			// System.out.println(s);
			// mv.setViewName("redirect:/ok/'"+lid+"'");
			modelMap1.put("quesshow", displayservice.findAllque());

			mv.setViewName("welcome");

		} else {
			System.out.println("somthing is wrong");
			mv.setViewName("index");
		}
		return mv;

	}


	

	
	
//	 @RequestMapping(value = { "ok/id" }, method = RequestMethod.POST)
//	public String process(Model model, HttpSession session) {
//		session.setAttribute("id",4);
//		return "welcome";
//	 }
//			 @RequestMapping(value = "ok/id")
//			    public RedirectView handleTestRequest (Model model) {
//			       // model.addAttribute("attr", "attrVal");
//			        model.addAttribute("testPath", "pathValue");
//
//			        RedirectView rv = new RedirectView();
//			        rv.setContextRelative(true);
//			        rv.setUrl("/test2/myone/id");
//			        return rv;
//			    }
//
//			    @RequestMapping("test2/{testPath}/id")
//			    public String handleRequest (@PathVariable("testPath") String testPath,
//			                                 @PathVariable("id") String id,
//			                                
//			                                 Model model) {
//
//			        model.addAttribute("testPath", testPath);
//			        model.addAttribute("id", id);
//			        
//			        return "Answer";
//			    }
////			    @RequestMapping(value = "/ask", method = RequestMethod.GET)
////				public ModelAndView asking() {
////					ModelAndView model = new ModelAndView("ask");
////					model.addObject("asksave",new Registerbean());
////					return model;
////				}
//			    @RequestMapping(value = { "/ask" }, method = RequestMethod.GET)
//				public ModelAndView insert() {
//				 
//				 
//					return new ModelAndView("redirect:/list1");
//				}
//			    

//			@PostMapping("/login")
//			public ModelAndView login(@ModelAttribute("logus") Registerbean person) {
//				boolean b = sob.log(person);
//				if(b)
//					return new ModelAndView("Welcome");
//				else
//					return new ModelAndView("redirect:/index");
//			}

}