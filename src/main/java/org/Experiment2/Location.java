package org.Experiment2;

import org.jetbrains.annotations.NotNull;

/**
 * 1）题目要求：设计一个名为Location的类，定位二维数组中的最大值及其位置。这个类包括公共的数据域row、column和maxValue，
 *      二维数组中的最大值及其下标用double型的maxValue以及int型的row和column存储。
 * 编写下面的方法，返回一个二维数组中最大值的位置，返回值是一个Location的实例。
 * public static Location locateLargetst(double[][] a)
 *
 * 编写一个测试程序，提示用户输入一个二维数组，然后显示这个数组中的最大元素及下标。运行实例如下：
 * 输入二维数组的行数和列数: 3 4
 * 输入数组:
 * 23.5 35 2 10
 * 4.5 3 45 3.5
 * 35 44 5.5 9.6
 * 最大元素及其下标是: 45 在(1,2)
 */
public class Location {
    public int row;
    public int column;
    public double maxValue = Double.MIN_VALUE;

    public Location() {
    }

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
    }
    public static @NotNull Location locateLargest(double[][] a) {
        Location location = new Location();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("输入二维数组的行数和列数：");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] a = new double[row][column];
        System.out.println("输入数组：");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        Location location = locateLargest(a);
        System.out.println("最大元素及其下标是：" + location.maxValue + " 在(" + location.row + "," + location.column + ")");
    }
}
