package com.cg.service;

import java.util.List;

import com.cg.bean.CourseBean;

public interface IService {
	public List<CourseBean> getAllCourses();

	 int addCourse(CourseBean course);
}
