package CalcProject;

import java.util.*;
//基于控制台的计算器实训项目
public class Main {

	public static int intOut() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的第一个整数");
		int data1=sc.nextInt();
		System.out.println("请输入你的第二个整数");
		int data2=sc.nextInt();
		System.out.println("请输入运算符");
		String s=sc.next();
		if("+".equals(s)) {
			return data1+data2;
		}
		else if("-".equals(s)) {
			return data1-data2;
		}
		else if("*".equals(s)) {
			return data1*data2;
		}
		else if("/".equals(s)) {
			if(data2==0) {
				System.out.println("被除数不能为0");
			}
			return data1/data2;
		}
		else {
			return 0;
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("欢迎使用计算器");
		System.out.println("输入exit退出，use使用");
		String exit=sc.next();
		while("use".equals(exit)) {
				int ret=intOut();
				System.out.println("结果是："+ret);
				System.out.println();
				System.out.println("输入exit退出，use使用");
				exit=sc.next();
		}
		System.out.println("欢迎使用");
	}
}
