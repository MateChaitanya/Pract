package com.app.main;

import com.app.config.AppConfig;
import com.app.model.Student;
import com.app.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService service = context.getBean(StudentService.class);

        // ✅ INSERT
        service.addStudent(new Student(1, "Amit", 22));

        // ✅ VIEW
        service.viewStudents();

        // ✅ UPDATE
        service.updateStudent(new Student(1, "Rahul", 25));

        // ✅ DELETE
        service.deleteStudent(1);
    }
}
