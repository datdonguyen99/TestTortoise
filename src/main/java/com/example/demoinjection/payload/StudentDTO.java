package com.example.demoinjection.payload;

public class StudentDTO {
    private Long id;
    private String name;
    private Integer exp;

    public StudentDTO(){}
    public StudentDTO(Long id, String name, Integer exp) {
        this.id = id;
        this.name = name;
        this.exp = exp;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getExp() {
        return exp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }
}
