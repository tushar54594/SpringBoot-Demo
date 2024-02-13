package com.tushar.springjpa;

import com.tushar.springjpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

//    @Query("select s from Student s where s.name = ?1")
//    List<Student> findByName(String name);  //This will work without the above query also.
    //JPA will create certain queries behind the scenes according to the column names
    //make sure method name starts by findBy and followed by column name

//      List<Student> findByMarks(int marks);
      List<Student> findByMarksGreaterThan(int marks);
      //like this there are many methods already defined in JPA

}
