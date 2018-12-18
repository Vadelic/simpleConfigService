package com.komyshenets.domain;

import org.hibernate.annotations.MapKeyType;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Entity
public class Config extends JPA {
    private Stage stage;
    private List<Tag> tags;
    private LocalDateTime createDate;
    private LocalDateTime deleteDate;
    private String json;
    private Map<AttributeDefinition, String> properties;

    @OneToOne
    public Stage getStage() {
        return stage;
    }

    @OneToMany()  public List<Tag> getTags() {
        return tags;
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

    @ElementCollection
    @CollectionTable
    public Map<AttributeDefinition, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<AttributeDefinition, String> properties) {
        this.properties = properties;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
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


}
