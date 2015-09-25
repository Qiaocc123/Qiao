package com.zimu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zimu.dao.knowledgeTypeDao;
import com.zimu.entity.knowledgeType;

@Controller
@RequestMapping("/repository")
public class knowledgeTypeController {
	
	@Resource
	private knowledgeTypeDao knowledgeTypeDao;
	
	
	@RequestMapping(value="login")
    public ModelAndView showAll(){
    	ModelAndView MV = new ModelAndView("repository");
    	List<knowledgeType> knowledgeTypeList = new ArrayList<knowledgeType>();
    	knowledgeTypeList = knowledgeTypeDao.findAll();
    	MV.addObject("knowledgeTypeList",knowledgeTypeList);
    	return MV;
    }
	
	@RequestMapping(value="insert")  
	public String insert( knowledgeType knowledgeType ) throws Exception {  
		knowledgeTypeDao.save(knowledgeType);
		return "redirect:/repository/login";
	}
	
	
	 	
	
	@RequestMapping(value="delect")
	public ModelAndView delete() throws Exception{
		ModelAndView mv = new ModelAndView("delect");
		return mv;
	}
	@RequestMapping(value="delecter")
	public String del(int typeID) throws Exception{
		knowledgeTypeDao.delect(typeID);
		return "redirect:/repository/login";
	}
	
	@RequestMapping(value="select")
	public ModelAndView select() throws Exception{
		ModelAndView mv = new ModelAndView("select");
		return mv;
	}
	@RequestMapping(value="selecter")
	public String sel(int typeID,HttpServletRequest request){
		knowledgeType kt = knowledgeTypeDao.findbyid(typeID);
		request.getSession().setAttribute("kt", kt);
		return "redirect:/repository/select";
	}
	
	@RequestMapping(value="update")  
	public ModelAndView update() throws Exception {  
		return new ModelAndView("update");
	}
	

}
