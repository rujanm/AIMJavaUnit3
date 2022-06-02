package com.unit3;

public class Rectangle {
    double width = 1;
double height = 1;

public Rectangle(){

}

public Rectangle(double height, double width){
    this.height = height;
    this.width = width;
}

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea(){
        double area = this.height * this.width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2*(this.height + this.width);
        return perimeter;
    }
}
