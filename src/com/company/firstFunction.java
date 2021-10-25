package com.company;

public class firstFunction {
    private double radians;
    public double getA(){
        return radians;
    }
    public void setA(double radians){
        this.radians=radians;
    }
    public void cosCounter(){
        System.out.println(Math.cos(Math.toRadians(radians)));
    }
}
