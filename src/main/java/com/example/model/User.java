package com.example.model;

public class User {
    private String id;

    private Integer type;

    private String gruop;

    private Integer done;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getGruop() {
        return gruop;
    }

    public void setGruop(String gruop) {
        this.gruop = gruop == null ? null : gruop.trim();
    }

    public Integer getDone() {
        return done;
    }

    public void setDone(Integer done) {
        this.done = done;
    }
}