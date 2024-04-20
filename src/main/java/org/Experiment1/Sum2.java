package org.Experiment1;
import static java.lang.Long.SIZE;

/**
 * 程序功能：求3+33+333+…前10项之和，并将求和表达式与所求的和显示出来。
 */
public class Sum2 {
    public static void main(String[] args) {
        long t = 0;
        long sum = 0;
        for (int i = 1; i <= 10; i++) {
            t = t * 10 + 3;
            sum += t;
            System.out.print(t);
            if (i < 10) {
                System.out.print("+");
            } else {
                System.out.print("=");
            }
        }
        System.out.println(sum);
    }
}
