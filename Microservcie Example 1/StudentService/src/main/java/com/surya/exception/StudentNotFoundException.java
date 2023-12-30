package com.surya.exception;

public class StudentNotFoundException extends RuntimeException 
{
	
	private static final long serialVersionUID = 1L;
	
	private final Long studentId;

	public StudentNotFoundException(Long studentId) 
	{
		super("Student with ID " + studentId + " not found");
		this.studentId = studentId;
	}

	public Long getStudentId() 
	{
		return studentId;
	}
	
	
}
