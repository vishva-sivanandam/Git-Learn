package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Byname byname = applicationContext.getBean(Byname.class);
        System.out.println(byname.getAge());
        System.out.println(byname.getName());
        byname.actoreName();

    }
}
