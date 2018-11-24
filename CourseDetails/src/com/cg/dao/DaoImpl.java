package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.bean.CourseBean;
@Repository("coursesdao")
public class DaoImpl implements IDao {


	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public List<CourseBean> getAllCourses() {
		
			Query queryOne=entitymanager.createQuery("FROM CourseBean");
			List<CourseBean> myList=queryOne.getResultList();
			return myList;
		}

	@Override
	public int addCourse(CourseBean course) {
		entitymanager.persist(course);
		entitymanager.flush();
		return course.getCid();
		
	}
	

	
}
