package org.example;

import org.example.models.Capital;
import org.example.models.Country;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        Country colombia = new Country();
        colombia.setName("Colombia");
        Capital bogota = new Capital();
        bogota.setName("Bogota");
        colombia.setCapital(bogota);
        bogota.setCountry(colombia);


        // create EntityManager
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // access transaction object
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(colombia);
        entityManager.persist(bogota);
        transaction.commit();
        // close entity manager
        entityManager.close();
        entityManagerFactory.close();
    }
}