package ru.itsjava.quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(Quoter.class).sayQuote();
//        while (true){
//            Thread.sleep(100);
//            context.getBean(Quoter.class).sayQuote();
//        }

//        context.getBean(Quoter.class).sayQuote();
    }
}
