//Flow of this Project
//main → config → model → service → back to main → output

package com.app.main;

import com.app.config.AppConfig;
import com.app.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService service = context.getBean(StudentService.class);
        service.printStudent();
    }
}
