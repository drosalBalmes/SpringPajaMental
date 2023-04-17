package org.example;
import org.example.com.balmes.configuration.HolaMonConfiguracio;
import org.example.com.balmes.controller.HolaMonController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HolaMonConfiguracio.class);
        HolaMonController holaMonController = context.getBean(HolaMonController.class);

    }
}