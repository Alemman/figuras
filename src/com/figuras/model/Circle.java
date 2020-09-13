package com.figuras.model;

public class Circle {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public double getArea(){ return Math.PI * Math.pow(radio,2); }

    public void draw(){
        System.out.println("Circle");
    }

}
