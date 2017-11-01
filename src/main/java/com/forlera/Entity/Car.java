package com.forlera.Entity;

/**
 * Created by OLEX on 01.11.2017.
 */
public class Car {

    private String name;
    private int year;
    private int id;


   public Car(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
