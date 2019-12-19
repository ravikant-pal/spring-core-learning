package com.alok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectBean.xml");

        Student std= context.getBean("student",Student.class);
        AnotherStudent student = context.getBean("anotherStudent",AnotherStudent.class);

        std.studentDoingCheating();
        student.studentDoingCheating();

    }
}
