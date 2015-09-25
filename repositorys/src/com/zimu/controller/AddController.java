package com.zimu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zimu.dao.knowledgeTypeDao;

@Controller
@RequestMapping("/repository")
public class AddController {
	
	@Resource
	private knowledgeTypeDao knowledgeTypeDao;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView add(HttpServletRequest Request){
		

		
		return new ModelAndView("add");
	}

}
