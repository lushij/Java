package top.lu168;

import java.util.Scanner;
/*Ctrl+Alt+L  格式化代码*/

public class mScanner {
    public static void main(String[] args) {
        mScanner();
    }

    public static void mScanner() {
        /* System.out.print输出数据不换行
         *  System.out.println()输出数据自动换行*/
        Scanner sc = new Scanner(System.in);
        System.out.print("姓名：");
        String name = sc.next();/*字符串*/
        System.out.print("年龄：");
        int age = sc.nextInt();
        System.out.print("学号：");
        int id = sc.nextInt();
        System.out.println("注册成功！");

    }
}
