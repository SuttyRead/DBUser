package com.ua.sutty.dao;

import com.ua.sutty.model.Car;
import com.ua.sutty.model.Person;
import com.ua.sutty.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class PersonDAOMySQLImpl implements PersonDAO {

    @Override
    public void addPerson(Person person) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(person);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void removePerson(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = session.get(Person.class, id);
        session.remove(person);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Person getPerson(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = session.get(Person.class, id);
        session.getTransaction().commit();
        session.close();
        return person;
    }

    @SuppressWarnings(value = "unchecked")
    @Override
    public List<Person> getAllPersons() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Person> persons = session.createQuery("from Person ").list();
        session.getTransaction().commit();
        session.close();
        return null;
    }

    @Override
    public void updatePerson(Person person) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(person);
        session.getTransaction().commit();
        session.close();
    }
}
