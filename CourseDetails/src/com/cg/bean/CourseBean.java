package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class CourseBean {
@Id
//@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="c_id")
private int cid;
@Column(name="c_name")
private String cname;
@Column(name="c_fee")
private double cfee;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public double getCfee() {
	return cfee;
}
public void setCfee(double cfee) {
	this.cfee = cfee;
}
public CourseBean(int cid, String cname, double cfee) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cfee = cfee;
}
public CourseBean() {
	super();
}

}
