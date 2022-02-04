package ru.itsjava;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("farmer")
//@RequiredArgsConstructor
public class KindFarmer {
    private final Animal animal;

//    @Autowired
    public KindFarmer(@Qualifier("piglet") Animal animal) {
        this.animal = animal;
    }

//    public void setAnimal(Animal animal) {
//        this.animal = animal;
//    }

    public void hiToAnimal(){
        System.out.println("Привет моя любимая");
        animal.say();
    }
}
