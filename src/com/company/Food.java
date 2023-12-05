package com.company;

public class Food {
    private String name;
    private double kg;


    public Food(String name, double kg) {
        this.name = name;
        this.kg = kg;
    }

    public Food() {
        this.name = "";
        this.kg = 0;
    }

    public String getName() {
        return name;
    }

    public double getKg() {
        return kg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }
}
