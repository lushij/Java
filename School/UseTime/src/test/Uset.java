package test;

import java.util.Scanner;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.nanoTime;

public class Uset {
    public static void main(String[] args) {
        System.out.println(currentTimeMillis());//获取毫秒时间
        System.out.println(nanoTime()+"ns");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.printf("count=%d\n",a*b-c*d);
        sc.close();
    }
}
