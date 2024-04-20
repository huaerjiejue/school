package org.Experiment1;
import java.util.Scanner;
import java.util.Random;
/**
 * （1）程序功能：定义一个int型的一维数组，数组的长度由键盘输入，为数组中的元素随机赋值（随机数在0~100）。依次完成如下功能：
 * (a) 输出数组中的元素。每行输出最多5个数字，数字之间用空格键分隔；
 * (b) 计算数组中元素之和，并输出；
 * (c) 求出数组中元素的最大值及其位置(若有多个相同的最大值，仅输出第一个)，并输出。
 */
public class ArrayEx {
    private int[] arr;
    private int length;
    private void init(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        length = input.nextInt();
        arr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(101);
        }
    }
    public void display(){
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
    public void sum(){
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        System.out.println("数组元素之和为：" + sum);
    }
    public void max(){
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        index += 1;
        System.out.println("数组中最大值为：" + max + "，位置为：" + index);

    }
    public static void main(String[] args) {
        ArrayEx arrayEx = new ArrayEx();
        arrayEx.init();
        arrayEx.display();
        arrayEx.sum();
        arrayEx.max();
    }
}
