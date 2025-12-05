package com.app.service;

import com.app.dao.StudentDao;
import com.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    private StudentDao dao;

    public void addStudent(Student s) {
        dao.insertStudent(s);
    }

    public void viewStudents() {
        List<Student> list = dao.getAllStudents();
        for (Student s : list) {
            System.out.println(
                    s.getId() + " " + s.getName() + " " + s.getAge());
        }
    }

    public void updateStudent(Student s) {
        dao.updateStudent(s);
    }

    public void deleteStudent(int id) {
        dao.deleteStudent(id);
    }
}
