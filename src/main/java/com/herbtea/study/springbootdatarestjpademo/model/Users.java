package com.herbtea.study.springbootdatarestjpademo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "testuser")
public class Users {
    private  String id;
    private  String name;
    private  Long age;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ages=" + age +
                '}';
    }
}
