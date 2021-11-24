package com.springbootrestapi.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cource {

    @Id
    private long courceId;
    private String courceName;
    private String title;

    public Cource(long courceId, String courceName, String title) {
        this.courceId = courceId;
        this.courceName = courceName;
        this.title = title;
    }

    public Cource() {

    }

    public long getCourceId() {
        return courceId;
    }

    public void setCourceId(long courceId) {
        this.courceId = courceId;
    }

    public String getCourceName() {
        return courceName;
    }

    public void setCourceName(String courceName) {
        this.courceName = courceName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Cource{" +
                "courceId=" + courceId +
                ", courceName='" + courceName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}

