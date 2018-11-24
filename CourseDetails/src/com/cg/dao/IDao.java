package com.cg.dao;

import java.util.List;

import com.cg.bean.CourseBean;


public interface IDao {

	public List<CourseBean> getAllCourses();

	 int addCourse(CourseBean course);
}
