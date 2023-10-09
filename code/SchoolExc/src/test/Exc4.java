package test;

import java.util.Scanner;

public class Exc4 {
	public static  void main(String[]args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();//数
		int count=sc.nextInt();//几次循环
		int sum=0;
		int i=1;
		int synum=0;
		sum+=synum;
		while(i++ <=count) {
			//1 2  1+11=12
			synum=synum*10+num;
			//System.out.println(synum);
			sum+=synum;
		}
		System.out.println(sum);
	}

}
