//Flow of this Project
//main → config → model → service → back to main → output

package com.app.main;

import com.app.config.AppConfig;
import com.app.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {      //1  Start from here

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);        //2  This starts the Spring Container. it open appconfig class

        StudentService service = context.getBean(StudentService.class);    //6  it internally called student display method
        service.printStudent();
    }
}
