package com.gentech.relation.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private Long studentId;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_email")
	private String emailId;
	@Column(name = "student_location")
	private String location;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "students_courses",
	joinColumns = {@JoinColumn(name = "student_student_id")},
	inverseJoinColumns = {@JoinColumn(name = "course_course_id")})
	
	private Set<Course> courses=new HashSet<>();

	public Student() {
		
	}
	public Student(String studentName, String emailId, String location) {
		super();
		this.studentName = studentName;
		this.emailId = emailId;
		this.location = location;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}
