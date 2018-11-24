package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.bean.CourseBean;
import com.cg.dao.DaoImpl;
import com.cg.dao.IDao;
@Service
public class ServiceImpl implements IService{

	IDao dao=new DaoImpl();
	
	
	@Override
	public List<CourseBean> getAllCourses() {
	
		return dao.getAllCourses();
	}


	@Override
	public int addCourse(CourseBean course) {
		
		return dao.addCourse(course);
	}

}
