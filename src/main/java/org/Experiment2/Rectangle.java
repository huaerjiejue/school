package org.Experiment2;

/**
 * 题目要求：设计一个名为Rectangle的类表示矩形。这个类包括：
 * 两个名为width和height的double型private成员变量，它们分别表示矩形的宽和高。width和height的默认值都为1。
 * （1）创建矩形的无参构造方法。
 * （2）创建width和height为指定值的矩形的构造方法。
 * （3）一个名为getArea()的public方法返回这个矩形的面积，返回值为double型。
 * （4）一个名为getPerimeter()的public方法返回矩形周长，返回值为double型。
 * 编写一个测试程序，创建两个Rectangle对象：一个矩形的宽为4高为40，另一个矩形的宽为3.5高为35.9。依次显示每个矩形的宽、高、面积和周长。
 */

public class Rectangle {
    private double width;
    private double height;
    public Rectangle() {
        this.height = 1;
        this.width = 1;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
    public void display() {
        System.out.println("矩形的宽为：" + this.width);
        System.out.println("矩形的高为：" + this.height);
        System.out.println("矩形的面积为：" + this.getArea());
        System.out.println("矩形的周长为：" + this.getPerimeter());
        System.out.println("----------------------");
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        rectangle1.display();
        rectangle2.display();
    }
}
