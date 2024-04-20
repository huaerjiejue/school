package org.Experiment1;
import java.util.Scanner;
/**
 * （1）需求说明
 * 	循环输入商品编号，显示对应的商品（T恤、网球鞋、网球拍）价格
 * 	输入“n”结束循环
 * （2）实现思路
 * （a）分析循环条件和循环操作
 *      			循环条件：用户输入“n”时退出循环
 * 				循环操作：输入商品编号，显示对应的商品价格
 * （b）套用do-while语法写出代码
 */
class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}

public class Shop {
    private Product[] products = {
            new Product("T恤", 245.0),
            new Product("网球鞋", 570.0),
            new Product("网球拍", 320.0)
    };
    public void display(){
        System.out.println("商品列表：");
        System.out.println("********************************");
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + 1 + "." + products[i].getName() + "：" + products[i].getPrice());
        }
        System.out.println("********************************");
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Shop shop = new Shop();
        shop.display();
        do {
            System.out.println("请输入商品编号（1-3）：");
            int num = input.nextInt();
            if (num < 1 || num > 3) {
                System.out.println("输入错误，请重新输入！");
                continue;
            }
            System.out.println("商品" + shop.products[num - 1].getName() + "      " + shop.products[num - 1].getPrice()+"元");
            System.out.println("是否继续购买？（y/n）");
        }
        while (!input.next().equals("n"));
    }
}


