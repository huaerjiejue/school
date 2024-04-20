package org.Experiment2;

/**
 * 题目要求：设计一个名为Fan的类表示一个风扇。这个类包括：
 * （1）三个名为SLOW、MEDIUM和FAST而值为1、2、3的常量表示风扇的速度。
 * （2）一个名为speed的int类型私有数据域表示风扇的速度（默认值为SLOW）。
 * （3）一个名为on的boolean类型私有数据域表示风扇是否打开（默认值为false）。
 * （4）一个名为radius的double类型私有数据域表示风扇的半径（默认值为5）。
 * （5）一个名为color的String类型数据域表示风扇的颜色（默认值为blue）。
 * （6）给出四个数据域的访问器（getter）和修改器(setter)。
 * （7）一个创建默认风扇的无参构造方法。
 * （8）一个名为toString()的方法返回描述风扇的字符串。如果风扇是打开的，那么该方法在一个组合的字符串中返回风扇的速度、颜色和半径。如果风扇没有打开，
 *      该方法返回一个由“fan is off”和风扇颜色、半径组成的字符串。
 * 实现这个类。编写一个测试程序，创建两个Fan对象。将第一个对象设置为最大速度、半径为10、颜色为yellow、状态为打开。
 * 将第二个对象设置为中等速度、半径为5、颜色为blue、状态为关闭。通过调用它们的toString方法显示这些对象。
 */
public class Fun {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fun() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isOn() {
        return this.on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        if (isOn()) {
            return "风扇的速度为：" + this.speed + "，风扇的颜色为：" + this.color + "，风扇的半径为：" + this.radius;
        } else {
            return "fan is off，风扇的颜色为：" + this.color + "，风扇的半径为：" + this.radius;
        }
    }
    public static void main(String[] args) {
        Fun fun1 = new Fun();
        Fun fun2 = new Fun();
        fun1.setSpeed(3);
        fun1.setRadius(10);
        fun1.setColor("yellow");
        fun1.setOn(true);
        fun2.setSpeed(2);
        fun2.setRadius(5);
        fun2.setColor("blue");
        fun2.setOn(false);
        System.out.println(fun1.toString());
        System.out.println(fun2.toString());
    }
}
