package com.gentech.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gentech.relation.entity.Course;
import com.gentech.relation.entity.Student;
import com.gentech.relation.repository.CourseRepository;
import com.gentech.relation.repository.StudentRepository;

@SpringBootApplication
public class SpringbootManyToManyRelationshipApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootManyToManyRelationshipApplication.class, args);
	}

	@Autowired
	private CourseRepository courseRepo;

	@Autowired
	private StudentRepository studentRepo;



	@Override
	public void run(String... args) throws Exception {

		Student student1=new Student("Santosh","santosh@gss.com","Bangalore");
		Student student2=new Student("Richard","richard@gss.com","Mangalore");

		Course course1=new Course("Core Java", "Programming Language");
		Course course2=new Course("Selenium Automation", "Web Automation Tool");

		//Add Courses to Student1
		student1.getCourses().add(course1);
		student1.getCourses().add(course2);

		//Add Courses to Student2
		student2.getCourses().add(course1);
		student2.getCourses().add(course2);

		//Add Students to Course1
		course1.getStudents().add(student1);
		course1.getStudents().add(student2);

		//Add Students to Course1
		course2.getStudents().add(student1);
		course2.getStudents().add(student2);
		
		studentRepo.save(student1);
		studentRepo.save(student2);
	}

}
