/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherintance;

/**
 *
 * @author Nazwajafni
 */
 abstract class Shape {
    abstract double area();

    void printArea() {
        System.out.println(getClass().getSimpleName() + " area = " + area());
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    double area() {
        return w * h;
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override
    double area() {
        return Math.PI * r * r;
    }
}

public class MainShape3 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Triangle(3, 4),
            new Rectangle(5, 6),
            new Circle(2.0)
        };

        double totalArea = 0;
        for (Shape s : shapes) {
            s.printArea();
            totalArea += s.area();
        }

        System.out.println("Total area = " + totalArea);
    }
}
