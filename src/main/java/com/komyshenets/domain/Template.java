package com.komyshenets.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Template extends JPA {
    private List<Tag> tags;
    private List<Config> configs;
    private LocalDateTime createDate;
    private LocalDateTime deleteDate;
    private String json;

    private List<AttributeDefinition> attributes;


    @OneToMany()
    public List<Tag> getTags() {
        return tags;
    }

    @OneToMany()
    public List<Config> getConfigs() {
        return configs;
    }

    @Column
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    @Column
    public LocalDateTime getDeleteDate() {
        return deleteDate;
    }

    @Column
    public String getJson() {
        return json;
    }

    @OneToMany()
    public List<AttributeDefinition> getAttributes() {
        return attributes;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void setConfigs(List<Config> configs) {
        this.configs = configs;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public void setDeleteDate(LocalDateTime deleteDate) {
        this.deleteDate = deleteDate;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public void setAttributes(List<AttributeDefinition> attributes) {
        this.attributes = attributes;
    }
}
