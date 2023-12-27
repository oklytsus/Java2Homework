package org.softserve.academy;


import java.util.ArrayList;
import java.util.List;

class Rectangle {
    private double width;
    private double height;
    private final double ANGLE = 90;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea(double width, double height) {
        return width * height;
    }

    public double calculatePerimeter(double width, double height) {
        return 2 * width + 2 * height;
    }

    public double getDiagonal(double width, double height) {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getANGLE() {
        return ANGLE;
    }


}

public class Task2Rectangle {
    public static void main(String[] args) {
        //create 1 object by using the default constructor that initializes all fields to their default values.
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(4);
        rectangle1.setHeight(8);

        //create 2 object by using the constructor that takes the width and height.
        Rectangle rectangle2 = new Rectangle(3, 4);

        //create variables for Area, Perimeter and Diagonal
        double areaOfRectangle;
        double perimeterOfRectangle;
        double diagonalOfRectangle;

        //create list of Rectangle objects
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);

        //create iterator to go through the list of Rectangle objects
        int iterator = 1;
        for (Rectangle r : rectangles) {
            System.out.println("Rectangle" + iterator + ":");

            //calculate the Area of Rectangle objects and print the result
            areaOfRectangle = r.calculateArea(r.getWidth(), r.getHeight());
            System.out.println("The Area = " + areaOfRectangle);

            //calculate the Perimeter of Rectangle objects and print the result
            perimeterOfRectangle = r.calculatePerimeter(r.getWidth(), r.getHeight());
            System.out.println("The Perimeter = " + perimeterOfRectangle);

            //calculate the Diagonal of Rectangle objects and print the result
            diagonalOfRectangle = r.getDiagonal(r.getWidth(), r.getHeight());
            System.out.printf("The Diagonal = %.2f\n", diagonalOfRectangle);
            iterator++;
        }

    }

}
