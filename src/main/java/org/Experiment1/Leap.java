package org.Experiment1;

/**
 * （1）程序功能：使用if...else 语句构造多分支，判断某一年是否为闰年。键盘输入年份。闰年的条件是符合下面二者之一：能被4 整除，但不能被100 整除；能被400 整除。
 * （2）编写源程序文件，代码如下。
 * public class Leap {
 * public static void main(String args[]) {
 * <p>
 * }
 * }
 */

import java.util.Scanner;

public class Leap {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}
