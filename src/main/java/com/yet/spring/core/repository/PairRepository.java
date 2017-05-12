package com.yet.spring.core.repository;

import com.yet.spring.core.entity.Pair;
import com.yet.spring.core.entity.Weekdays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PairRepository extends JpaRepository<Pair, Long> {
    @Query("SELECT p FROM Pair p WHERE p.course =:course AND p.group =:group AND p.weekday = :weekday")
    Pair findByCourseAndGroupAndWeekday(@Param("course") int course, @Param("group") int group, @Param("weekday") Weekdays weekday);
}
