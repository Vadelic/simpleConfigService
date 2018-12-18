package com.komyshenets.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Component extends JPA {

    private Template template;

    @OneToOne
    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }
}
