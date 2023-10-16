package test;
 
import java.util.*;
import test.calc;
public class calcMain {
	public static  String name="小米";//全局变量
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		calc r=new calc();
		int a= sc.nextInt();
		int b=sc.nextInt();
		int ret = r.sub(a,b);
		System.out.println(ret);
	}
	
	
	public void countNum() {
		
	}
	
}
