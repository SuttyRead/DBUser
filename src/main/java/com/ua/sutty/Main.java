package com.ua.sutty;

import com.ua.sutty.dao.CarDAO;
import com.ua.sutty.dao.CarDAOMySQLImpl;
import com.ua.sutty.dao.PersonDAO;
import com.ua.sutty.dao.PersonDAOMySQLImpl;
import com.ua.sutty.model.Car;
import com.ua.sutty.model.Person;

public class Main {

    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAOMySQLImpl();
        Person alexandr = personDAO.getPerson(4);
        Car car1 = Car.builder()
                .mark("Q10")
                .model("audi")
                .person(alexandr)
                .build();
        Car car2 = Car.builder()
                .mark("Q11")
                .model("audi")
                .person(alexandr)
                .build();
        Car car3 = Car.builder()
                .mark("Q12")
                .model("audi")
                .person(alexandr)
                .build();
//

//        personDAO.addPerson(alexandr);
        CarDAO carDAO = new CarDAOMySQLImpl();
        carDAO.addCar(car1);
        carDAO.addCar(car2);
        carDAO.addCar(car3);
//        Car car = carDAO.getCar(4);
//        System.out.println(car);
    }

}
