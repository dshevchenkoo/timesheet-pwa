package com.example.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Timesheet {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String numberGroup;
    private String day;

    private String firstLessonName;
    private String secondLessonName;
    private String therdLessonName;
    private String forthLessonName;
    private String fifthLessonName;
    private String sixthLessonName;
    private String seventhLessonName;

    private String firstTeacherName;
    private String secondTeacherName;
    private String therdTeacherName;
    private String forthTeacherName;
    private String fifthTeacherName;
    private String sixthTeacherName;
    private String seventhTeacherName;

    private Integer firstClassroom;
    private Integer secondClassroom;
    private Integer therdClassroom;
    private Integer forthClassroom;
    private Integer fifthClassroom;
    private Integer sixthClassroom;
    private Integer seventhClassroom;

    public Timesheet(){}

    public Timesheet(String numberGroup, String day, String firstLessonName, String secondLessonName, String therdLessonName, String forthLessonName, String fifthLessonName, String sixthLessonName, String seventhLessonName, String firstTeacherName, String secondTeacherName, String therdTeacherName, String forthTeacherName, String fifthTeacherName, Integer firstClassroom, Integer secondClassroom, Integer therdClassroom, Integer forthClassroom, Integer fifthClassroom, Integer sixthClassroom) {
        this.numberGroup = numberGroup;
        this.day = day;
        this.firstLessonName = firstLessonName;
        this.secondLessonName = secondLessonName;
        this.therdLessonName = therdLessonName;
        this.forthLessonName = forthLessonName;
        this.fifthLessonName = fifthLessonName;
        this.sixthLessonName = sixthLessonName;
        this.seventhLessonName = seventhLessonName;
        this.firstTeacherName = firstTeacherName;
        this.secondTeacherName = secondTeacherName;
        this.therdTeacherName = therdTeacherName;
        this.forthTeacherName = forthTeacherName;
        this.fifthTeacherName = fifthTeacherName;
        this.sixthTeacherName = sixthTeacherName;
        this.seventhTeacherName = seventhTeacherName;
        this.firstClassroom = firstClassroom;
        this.secondClassroom = secondClassroom;
        this.therdClassroom = therdClassroom;
        this.forthClassroom = forthClassroom;
        this.fifthClassroom = fifthClassroom;
        this.sixthClassroom = sixthClassroom;
        this.seventhClassroom = seventhClassroom;
    }

    public String getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(String numberGroup) {
        this.numberGroup = numberGroup;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getFirstLessonName() {
        return firstLessonName;
    }

    public void setFirstLessonName(String firstLessonName) {
        this.firstLessonName = firstLessonName;
    }

    public String getSecondLessonName() {
        return secondLessonName;
    }

    public void setSecondLessonName(String seconfLessonName) {
        this.secondLessonName = seconfLessonName;
    }

    public String getTherdLessonName() {
        return therdLessonName;
    }

    public void setTherdLessonName(String therdLessonName) {
        this.therdLessonName = therdLessonName;
    }

    public String getForthLessonName() {
        return forthLessonName;
    }

    public void setForthLessonName(String forthLessonName) {
        this.forthLessonName = forthLessonName;
    }

    public String getFifthLessonName() {
        return fifthLessonName;
    }

    public void setFifthLessonName(String fifthLessonName) {
        this.fifthLessonName = fifthLessonName;
    }

    public String getSixthLessonName() {
        return sixthLessonName;
    }

    public void setSixthLessonName(String sixthLessonName) {
        this.sixthLessonName = sixthLessonName;
    }

    public String getSeventhLessonName() {
        return seventhLessonName;
    }

    public void setSeventhLessonName(String seventhLessonName) {
        this.seventhLessonName = seventhLessonName;
    }

    public String getFirstTeacherName() {
        return firstTeacherName;
    }

    public void setFirstTeacherName(String firstTeacherName) {
        this.firstTeacherName = firstTeacherName;
    }

    public String getSecondTeacherName() {
        return secondTeacherName;
    }

    public void setSecondTeacherName(String secondTeacherName) {
        this.secondTeacherName = secondTeacherName;
    }

    public String getTherdTeacherName() {
        return therdTeacherName;
    }

    public void setTherdTeacherName(String therdTeacherName) {
        this.therdTeacherName = therdTeacherName;
    }

    public String getForthTeacherName() {
        return forthTeacherName;
    }

    public void setForthTeacherName(String forthTeacherName) {
        this.forthTeacherName = forthTeacherName;
    }

    public String getFifthTeacherName() {
        return fifthTeacherName;
    }

    public void setFifthTeacherName(String fifthTeacherName) {
        this.fifthTeacherName = fifthTeacherName;
    }

    public String getSixthTeacherName() {
        return sixthTeacherName;
    }

    public void setSixthTeacherName(String sixthTeacherName) {
        this.sixthTeacherName = sixthTeacherName;
    }

    public String getSeventhTeacherName() {
        return seventhTeacherName;
    }

    public void setSeventhTeacherName(String seventhTeacherName) {
        this.seventhTeacherName = seventhTeacherName;
    }

    public Integer getFirstClassroom() {
        return firstClassroom;
    }

    public void setFirstClassroom(Integer firstClassroom) {
        this.firstClassroom = firstClassroom;
    }

    public Integer getSecondClassroom() {
        return secondClassroom;
    }

    public void setSecondClassroom(Integer secondClassroom) {
        this.secondClassroom = secondClassroom;
    }

    public Integer getTherdClassroom() {
        return therdClassroom;
    }

    public void setTherdClassroom(Integer therdClassroom) {
        this.therdClassroom = therdClassroom;
    }

    public Integer getForthClassroom() {
        return forthClassroom;
    }

    public void setForthClassroom(Integer forthClassroom) {
        this.forthClassroom = forthClassroom;
    }

    public Integer getFifthClassroom() {
        return fifthClassroom;
    }

    public void setFifthClassroom(Integer fifthClassroom) {
        this.fifthClassroom = fifthClassroom;
    }

    public Integer getSixthClassroom() {
        return sixthClassroom;
    }

    public void setSixthClassroom(Integer sixthClassroom) {
        this.sixthClassroom = sixthClassroom;
    }

    public Integer getSeventhClassroom() {
        return seventhClassroom;
    }

    public void setSeventhClassroom(Integer seventhClassroom) {
        this.seventhClassroom = seventhClassroom;
    }
}
