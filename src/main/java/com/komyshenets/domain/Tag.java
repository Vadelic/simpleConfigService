package com.komyshenets.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Tag extends JPA {
    String value;

    @Column
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
