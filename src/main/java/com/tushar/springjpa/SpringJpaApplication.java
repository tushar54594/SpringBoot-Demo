package com.tushar.springjpa;

import com.tushar.springjpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(1);
//		s1.setName("Tushar");
//		s1.setMarks(100);
//
//		s2.setRollNo(2);
//		s2.setName("Rahul");
//		s2.setMarks(88);
//
//		s3.setRollNo(3);
//		s3.setName("King");
//		s3.setMarks(74);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());

//		System.out.println(repo.findById(1));
		//NOTE: findById() -- This returns an optional object

//		Optional<Student> s = repo.findById(4);
//		System.out.println(s.orElse(new Student()));

//		System.out.println(repo.findByMarksGreaterThan(80));

		//update can be done using save(). If first uses select query to check if that object is present then it updates otherwise it creates another row.

		//delete
//		repo.delete(s3);
	}

}
