package com.ua.sutty.dao;

import com.ua.sutty.model.Car;
import com.ua.sutty.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class CarDAOMySQLImpl implements CarDAO {

    @Override
    public void addCar(Car car) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(car);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removeCar(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Car car = session.get(Car.class, id);
        session.remove(car);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Car getCar(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Car car = session.get(Car.class, id);
        session.getTransaction().commit();
        session.close();
        return car;
    }

    @SuppressWarnings(value = "unchecked")
    @Override
    public List<Car> getAllCars() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Car> cars = session.createQuery("from Car").list();
        session.getTransaction().commit();
        session.close();
        return null;
    }

    @Override
    public void updateCar(Car car) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(car);
        session.getTransaction().commit();
        session.close();
    }
}
