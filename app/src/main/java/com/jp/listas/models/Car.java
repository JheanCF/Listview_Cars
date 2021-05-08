package com.jp.listas.models;

import android.graphics.drawable.Drawable;

public class Car {
    private String name;
    private String cilindraje;
    private String model;
    private String value;
    private String image;

    public Car() {
    }

    public Car(String name, String cilindraje, String model, String value, String image) {
        this.name = name;
        this.cilindraje = cilindraje;
        this.model = model;
        this.value = value;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
