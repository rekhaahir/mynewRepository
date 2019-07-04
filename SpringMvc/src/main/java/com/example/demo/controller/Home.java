package com.example.demo.controller;

import java.net.http.HttpRequest;
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
import com.example.demo.bean.Point;
import com.example.demo.bean.Quebean;
import com.example.demo.bean.Registerbean;
import com.example.demo.services.Displayservice;
import com.example.demo.services.Services;

@Controller
public class Home {
	@Autowired
	Services sob;

	Quebean qobject = new Quebean();
	@Autowired
	Displayservice displayservice;
//main page login
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		String test="test@123";
		
		return "index";
	}
//open page register
	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("Register");
		model.addObject("save", new Registerbean());
		return model;
	}
//submit registeration
	@RequestMapping(value = { "/submitForm" }, method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("save") Registerbean ob) {
		String test="test@123";
		sob.insert(ob);
		return new ModelAndView("redirect:/list/test");
	}
//Question 
	@RequestMapping(value = { "/ask" }, method = RequestMethod.GET)
	public ModelAndView asking() {
		ModelAndView model = new ModelAndView("Questions");
		model.addObject("qadd", new Registerbean());
		return model;
	}
//submit Question
	@RequestMapping(value = { "/submitque" }, method = RequestMethod.POST)
	public ModelAndView ins1(@ModelAttribute("qadd") Quebean ob, HttpSession session) {
		long s2 = (long) session.getAttribute("id");
		System.out.println("s2" + "is" + s2);
		Registerbean rob = new Registerbean();
		rob.setId(s2);
		ob.setRb(rob);
		sob.insertque(ob);
		return new ModelAndView("redirect:/login");
	}
//display whole data
	@RequestMapping(value = { "/list" }, method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("products", displayservice.findAll());
		return "success";
	}
//answer display by qid
	@RequestMapping(value = { "/ask1" }, method = RequestMethod.GET)
	public ModelAndView asking1(Model model1, ModelMap mod, HttpSession session) {
		ModelAndView model = new ModelAndView("Answer");
		model.addObject("aadd", new Registerbean());
		model1.addAttribute("testPath", qobject.getQue());
		// displayservice.checkans(qobject.getQid());
		long l = (long) session.getAttribute("qid");
		mod.put("anssshow", displayservice.checkans(l));
		long sl = (long) session.getAttribute("id");
		
		
		Point p=displayservice.ridcheck(sl);
		System.out.println();
		if(p!=null)
		{
		long tl=p.getTotlike();
		System.out.println("tl"+tl);
		mod.put("tl", tl);
		}
//		System.out.println(qobject.getQid());
//		System.out.println(qobject.getQue());
		return model;
	}
	
//answer submit
	@RequestMapping(value = { "/ansins" }, method = RequestMethod.GET)
	public ModelAndView insans(@ModelAttribute("aadd") Ansbean oba, HttpSession session) {
		long s2 = (long) session.getAttribute("id");
		System.out.println("s2" + "is" + s2);
		Registerbean rob = new Registerbean();
		rob.setId(s2);
		oba.setRb(rob);
		Quebean qid = new Quebean();
		qobject.getQid();

		System.out.println("ses" + session.getAttribute("qid"));

		oba.setQbid(qobject);
		System.out.println(oba.getAns());
		sob.insertans(oba);
		return new ModelAndView("welcome");
	}

//check qid 	
	@RequestMapping(value = "/test/{qId}", method = RequestMethod.GET)
	public ModelAndView ss(@PathVariable("qId") Long qId, Model model, HttpSession session) {
		System.out.println(qId);

		session.setAttribute("qid", qId);
		Optional<Quebean> questionBean = displayservice.findQuestionById(qId);

		if (questionBean.isPresent()) 
		{
			model.addAttribute("testPath", questionBean.get().getQue());
			qobject.setQue(questionBean.get().getQue());
		}
			qobject.setQid(qId);

		return new ModelAndView("redirect:/ask1");

//	ModelAndView model1 = new ModelAndView("Answer");
//	model1.addObject("aadd", new Registerbean());
//	return model1;
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
	
//answer correct add points
	@RequestMapping(value = { "/correct/{aId}" }, method = RequestMethod.GET)
	public String authentication1(@PathVariable("aId") Long aId, Quebean qo, HttpSession session) {
		long l = (long) session.getAttribute("qid");
		System.out.println("aid" + aId);
		Quebean Qo = displayservice.findlogin(l);// error handle
		System.out.println(Qo.getRb().getId());
		long ll = Qo.getRb().getId();
		System.out.println(ll);
		long sl = (long) session.getAttribute("id");
		System.out.println(sl);
		if (ll == sl) {
			displayservice.ansupdate(aId);
			System.out.println("aid now" + aId);
	if( displayservice.findbypointid(aId)==null)
		{
			//System.out.println(p.getAb().getAid());
			//sob.pointinsert(aId, sl, l);
			}
			displayservice.pointupdate(aId);
			return "redirect:/ask1";
		}
		else
		{
			System.out.println("error");
		}
		return "index";
	}
	
	//like
		@RequestMapping(value = {"count/{aid}"}, method = RequestMethod.GET)
		public ModelAndView likeadd(@PathVariable("aid") long aid,HttpSession session,Model mp) {
			long l = (long) session.getAttribute("qid");
			long s2 = (long) session.getAttribute("id");
			//sob.pointinsert(aid, s2, l);
			mp.addAttribute("rid",s2);
		sob.likeadd(aid);
			ModelAndView model = new ModelAndView("Questions");
			model.addObject("qadd", new Registerbean());
			return model;
		}

	//Authentication of user
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
			modelMap1.put("quesshow", displayservice.findAllque());
			mv.setViewName("welcome");

		} 
		else 
		{
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