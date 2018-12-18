package com.komyshenets.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Stage extends JPA  {
    private String stateName;

    @Column
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
