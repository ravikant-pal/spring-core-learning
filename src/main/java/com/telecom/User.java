package com.telecom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("objectBean.xml");

        Airtel airtel = context.getBean("airtel",Airtel.class);


        System.out.println(airtel.getServicesStarted());

    }
}
