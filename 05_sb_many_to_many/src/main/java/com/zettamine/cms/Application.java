package com.zettamine.cms;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zettamine.cms.entities.Course;
import com.zettamine.cms.entities.Student;
import com.zettamine.cms.service.CourseService;
import com.zettamine.cms.service.StudentService;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Student student = new Student();
//		student.setStudentName("Pavithr Kumar");
//		Course course = new Course();
//		course.setCourseName("React JS");
//		Set<Course> courseSet = new HashSet<>();
//		courseSet.add(course);
//		student.setCourse(courseSet);
//		studentService.saveStudent(student);
//		
//		studentService.getStudentById(1);
//		studentService.deleteStudent(2);
//		Course course = new Course();
//		course.setCourseName("WEB");
//		
//		courseService.saveCourse(course);
//		studentService.enrollStudentInCourse(3, 1);
		//studentService.getStudentById(4);
		courseService.addStudentToCourse(4, 1);
		
	}

}
