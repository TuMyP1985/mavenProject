package ru.javarush.info.fatfaggy.animals;

import configs.MyConfig;
import ru.javarush.info.fatfaggy.animals.entities.Cat;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import week.WeekDay;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contextMyConf =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat1 = contextMyConf.getBean(Cat.class);
        System.out.println(cat1.getName());

        WeekDay day = contextMyConf.getBean(WeekDay.class);
        System.out.println(day.getWeekDayName());

//        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.animals.entities");
//
//        //для этого, классы должны бить помечены @Component
//        Cat cat = context.getBean(Cat.class);
//        Dog dog = (Dog) context.getBean("dog");
//        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);
//
//        System.out.println(cat.getName());
//        System.out.println(dog.getName());
//        System.out.println(parrot.getName());
    }
}
