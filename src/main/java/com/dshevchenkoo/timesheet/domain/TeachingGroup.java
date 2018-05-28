package com.dshevchenkoo.timesheet.domain;

import javax.persistence.*;

@Entity
public class TeachingGroup {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String number;
    public TeachingGroup() {
        this.number = "";
    }

    public TeachingGroup(String number) {
        this.number = number;
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
