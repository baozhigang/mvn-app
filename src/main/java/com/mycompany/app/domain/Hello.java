package com.mycompany.app.domain;

public class Hello {
    private Long id;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "id: "+ this.getId() +" name: "+ this.getName();
    }
}