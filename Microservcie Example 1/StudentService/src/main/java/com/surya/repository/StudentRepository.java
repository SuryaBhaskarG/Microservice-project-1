package com.surya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surya.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{

}
