package com.yet.spring.core.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "pair")
@NamedQuery(name = "Pair.getAll", query = "SELECT p FROM Pair p")
public class Pair {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pairId;

    @Column(name = "pair_name", length = 45)
    private String pairName;

    @Column(name = "course")
    private int course;

    @Column(name = "group")
    private int group;

    @Column(name = "weekday")
    private Weekdays weekday;

    @Column(name = "teacher_name", length = 45)
    private String teacherName;

    public Pair() {
    }

    public Pair(String pairName, int course, int group, Weekdays weekday, String teacherName) {
        this.pairName = pairName;
        this.course = course;
        this.group = group;
        this.weekday = weekday;
        this.teacherName = teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setPairId(long pairId) {
        this.pairId = pairId;
    }

    public void setPairName(String pairName) {
        this.pairName = pairName;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setWeekday(Weekdays weekday) {
        this.weekday = weekday;
    }

    public long getPairId() {
        return pairId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getPairName() {
        return pairName;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public Weekdays getWeekday() {
        return weekday;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "pairId=" + pairId +
                ", pairName='" + pairName + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", weekday=" + weekday +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
