package com.yet.spring.core.service;

import com.yet.spring.core.entity.Pair;
import com.yet.spring.core.entity.Weekdays;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public interface PairService {
    Pair addPair(Pair pair);
    void delete(long id);
    Pair findByCourseAndGroupAndWeekday(int course, int group, Weekdays weekday);
    Pair editPair(Pair pair);
    List<Pair> getAll();
}
