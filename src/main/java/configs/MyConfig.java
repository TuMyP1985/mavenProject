package configs;

import ru.javarush.info.fatfaggy.animals.entities.Cat;
import ru.javarush.info.fatfaggy.animals.entities.Dog;
import ru.javarush.info.fatfaggy.animals.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import week.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("ru.javarush.info.fatfaggy.animals.entities") //при создании контекста спринг видит, что ему нужно обработать класс MyConfig. Заходит в него и видит, что нужно просканировать пакет "ru.javarush.info.fatfaggy.animals.entities" и создать бины тех класов
public class MyConfig {
    @Bean
    public Dog getDog() {
        return new Dog();
    }
    @Bean
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setName("-killer");//м/о переопределить имя
        return cat;
    }
    @Bean("parrot-kesha")
    public Object weNeedMoreParrots() {
        return new Parrot();
    }

    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }


}
