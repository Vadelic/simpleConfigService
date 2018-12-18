package com.komyshenets.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AttributeDefinition extends JPA {
    private String name;
    private String type;
    private String mask;

    @Column
    public String getName() {
        return name;
    }

    @Column
    public String getType() {
        return type;
    }

    @Column
    public String getMask() {
        return mask;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
}
