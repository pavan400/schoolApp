package com.smitiv.schoolapp.service;

import java.io.Serializable;
import java.util.List;

import com.smitiv.schoolapp.dto.StudentDTO;

public interface IStudentService {

	Serializable saveStudent(StudentDTO dto);

	List<StudentDTO> getAllStudents();

}
