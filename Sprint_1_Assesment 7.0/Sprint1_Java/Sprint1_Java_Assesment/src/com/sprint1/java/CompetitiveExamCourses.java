package com.sprint1.java;


public class CompetitiveExamCourses {
	
	private String courseId;
	private String courseName;
	private String courseTeacher;
	private Integer courseDuration;
	private Integer totalFees;
	

	public CompetitiveExamCourses(String courseId,String courseName,String courseTeacher,
			Integer courseDuration,Integer totalFees) {
		//super();
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseTeacher=courseTeacher;
		this.courseDuration=courseDuration;
		this.totalFees=totalFees;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseTeacher() {
		return courseTeacher;
	}
	public void setCourseTeacher(String courseTeacher) {
		this.courseTeacher = courseTeacher;
	}
	public Integer getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}
	public Integer getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(Integer totalFees) {
		this.totalFees = totalFees;
	}
	
	@Override
	public String toString() {
		
		String courseDetails = "\n Course_Details = Id : " + courseId + ",Name : " + courseName + ","
				+ " Teacher :" + courseTeacher + "Duration :" + courseDuration +"months,"
				+ "Total Fees :" + totalFees + "" ;
				
		return courseDetails;
	}
			
	
}

