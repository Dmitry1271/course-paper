package com.yet.spring.core.service;


import com.yet.spring.core.entity.Pair;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.List;

import static javax.swing.UIManager.get;

public class PairService {
    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();

    public Pair add(Pair pair) {
        em.getTransaction().begin();
        Pair pairFromDB = em.merge(pair);
        em.getTransaction().commit();
        return pairFromDB;
    }

    public void delete(long id) {
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Pair get(long id) {
        return em.find(Pair.class, id);
    }

    public void update(Pair pair) {
        em.getTransaction().begin();
        em.merge(pair);
        em.getTransaction().commit();
    }

    public List<Pair> getAll() {
        TypedQuery<Pair> namedQuery = em.createNamedQuery("Pair.getAll", Pair.class);
        return namedQuery.getResultList();
    }
}
