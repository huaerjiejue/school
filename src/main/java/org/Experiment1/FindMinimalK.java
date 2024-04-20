package org.Experiment1;

/**
 * 程序功能：已知sum=1+2+3+4+...+n，求n，使得sum>=2000。
 */

public class FindMinimalK {
    public static void main(String args[]) {
        int sum = 0;
        int n = 0;
        while (sum < 2000) {
            n++;
            sum += n;
        }
        System.out.println("n=" + n);
    }
}
