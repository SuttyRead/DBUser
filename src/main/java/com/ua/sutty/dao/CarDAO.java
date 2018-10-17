package com.ua.sutty.dao;

import com.ua.sutty.model.Car;

import java.util.List;

public interface CarDAO {

    void addCar(Car car);

    void removeCar(long id);

    Car getCar(long id);

    List<Car> getAllCars();

    void updateCar(Car car);

}
