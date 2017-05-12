package com.yet.spring.core.service.impl;

import com.yet.spring.core.entity.Pair;
import com.yet.spring.core.entity.Weekdays;
import com.yet.spring.core.repository.PairRepository;
import com.yet.spring.core.service.PairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PairServiceImpl implements PairService {

    @Autowired
    private PairRepository pairRepository;

    @Override
    public Pair addPair(Pair pair) {
        Pair savePair = pairRepository.saveAndFlush(pair);
        return savePair;
    }

    @Override
    public void delete(long id) {
        pairRepository.delete(id);
    }

    @Override
    public Pair findByCourseAndGroupAndWeekday(int course, int group, Weekdays weekday) {
        return pairRepository.findByCourseAndGroupAndWeekday(course, group, weekday);
    }

    @Override
    public Pair editPair(Pair pair) {
        return pairRepository.saveAndFlush(pair);
    }

    @Override
    public List<Pair> getAll() {
        return pairRepository.findAll();
    }
}
