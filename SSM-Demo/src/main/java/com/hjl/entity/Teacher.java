package com.hjl.entity;

public class Teacher {
	private int Id;//id
	private int CollegeId;//学院id
	private String TeacherId;//教师编号
	private String TeacherName;//姓名
	private String TeacherPwd;//密码
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getCollegeId() {
		return CollegeId;
	}
	public void setCollegeId(int collegeId) {
		CollegeId = collegeId;
	}
	public String getTeacherId() {
		return TeacherId;
	}
	public void setTeacherId(String teacherId) {
		TeacherId = teacherId;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public String getTeacherPwd() {
		return TeacherPwd;
	}
	public void setTeacherPwd(String teacherPwd) {
		TeacherPwd = teacherPwd;
	}
	
 
}
