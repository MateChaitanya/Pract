//5 Injects Student object inside StudentService
package com.app.service;

import com.app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    @Autowired    // 5 inject student object auto
    private Student student;

    public void printStudent() {
        student.display();
    }
}
