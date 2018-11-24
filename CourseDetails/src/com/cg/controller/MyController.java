package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.bean.CourseBean;
import com.cg.service.IService;

@Controller
public class MyController{

	@Autowired
	IService service;
	@RequestMapping(value="all",method=RequestMethod.GET)
	public String getAll(){
		return "home";
		
	}
	
	@RequestMapping(value="show",method=RequestMethod.GET)
    public ModelAndView showAllEmployee(){
           List<CourseBean> myAllData=service.getAllCourses();
           return new ModelAndView("showall","temp", myAllData);
           }
	 @RequestMapping(value="enrollsucess",method=RequestMethod.GET)
	    public String employeeDelete(@RequestParam("eid") int id){
	          
	          // service.deleteEmployee(id);
	           return "sucess";
	           
	    }
	 //
	 
	 @RequestMapping(value="add",method=RequestMethod.GET)
		public String addCourse(@ModelAttribute("my") CourseBean cbean ){
			
			return "addcourse";
		}

		@RequestMapping(value="insertdata",method=RequestMethod.POST)
		public ModelAndView insertEmployee(@Valid@ModelAttribute("my") CourseBean course,BindingResult result)
		{
			//System.out.println("Name is "+emp.getEmpName());
			int id=0;
			
			 id=service.addCourse(course);
			 System.out.println(course.getCid());
			 System.out.println(course.getCname());
			 System.out.println(course.getCfee());
			
			return new ModelAndView("addsucess","cid",id);
			
		}

}
