package com.ua.sutty;

import com.ua.sutty.dao.CarDAO;
import com.ua.sutty.dao.CarDAOMySQLImpl;
import com.ua.sutty.dao.PersonDAO;
import com.ua.sutty.dao.PersonDAOMySQLImpl;
import com.ua.sutty.model.Car;
import com.ua.sutty.model.Person;

public class Main {

    public static void main(String[] args) {

//        Person alexandr = Person.builder()
//                .name("Alexandr")
//                .build();
//        Car car = Car.builder()
//                .mark("Q7")
//                .model("audi")
//                .person(alexandr)
//                .build();
//
//        PersonDAO personDAO = new PersonDAOMySQLImpl();
//        personDAO.addPerson(alexandr);
        CarDAO carDAO = new CarDAOMySQLImpl();
//        carDAO.addCar(car);
        Car car = carDAO.getCar(4);
        System.out.println(car);
    }

}
