package org.Experiment1;
import java.util.Scanner;

/**
 * 程序功能：在不同温度t时显示不同的解释说明。键盘输入温度（-5℃~40℃）。
 * t<10℃： 有点冷。要多穿衣服。
 * 10℃<= t <25℃：正合适。出去玩吧。
 * 25℃<= t <35℃：有点热。
 * t >=35℃：太热了！开空调。
 */

public class Temp {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个温度：");
        int t = input.nextInt();
        if (t < 10) {
            System.out.println("有点冷。要多穿衣服。");
        } else if (t < 25) {
            System.out.println("正合适。出去玩吧。");
        } else if (t < 35) {
            System.out.println("有点热。");
        } else {
            System.out.println("太热了！开空调。");
        }
    }
}
