package exc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		students[] Stu = new students[3];
//		for(int i=0;i<Stu.length;i++) {
//			Stu[i]=new students("name"+i,20+i);
//		}
//		for(students x:Stu) {
//			System.out.println(x.name+"的年龄是："+x.age);
//		}
		//回文数的判断
		//moom();
		Arr();
	}
	public static void moom() {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String s2=new StringBuilder(s).reverse().toString();//只能用stringBulider的翻转来用这个
		if(s2.equals(s)) {
			System.out.println("回文数");
		}else {
			System.out.println("不是回文数");
		}
	}
	
	public static void Arr() {
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*10);//Math.random()会随机生成0.0-1.0的数
		}
		int[] newArr = new int[10];
		int i=0;
		for(int x :arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x :arr) {
			if(x!=0) i++;
		}
			System.out.println(i);
	}

}
