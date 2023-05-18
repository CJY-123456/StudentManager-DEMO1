package com.cjy.pojo;

public class User {

    private int id;
    private String name;
    private int hours;
    private int schools;

    public void setSchools(int schools) {
        this.schools = schools;
    }

    public int getSchools() {
        return schools;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", schools=" + schools +
                '}';
    }
}
