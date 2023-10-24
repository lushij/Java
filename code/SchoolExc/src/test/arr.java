package test;

import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int[] arr= {1,2,3,4,5};
		int[] a=new int[10];//动态生成
		//System.out.println(arr.length);
//		for(int x :arr)
//		{
//			System.out.print(x);
//		}
		
		int[][] arr2 = new int[4][4];
//		for(int a1[]:arr2)
//		{
//			for(int x:a1)
//			{
//				x=sc.nextInt();
//			}
//		}
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<4;j++)
//			{
//				arr2[i][j]=sc.nextInt();
//			}
//		}
//		int cnt=0;
//		for(int a1[]:arr2)
//		{
//			for(int x:a1)
//			{
//				if(cnt==4)
//				{
//					System.out.println();
//					cnt=0;
//				}
//				System.out.print(x);
//				cnt++;
//			}
//		}
	
		int[]y= {1,2,3,5,6,2,1,7,8};
		for(int i=0;i<y.length-1;i++)
		{
			for(int j=i+1;j<y.length-1;j++)
			{
				if(y[i]>y[j])
				{
					int t=y[i];
					y[i]=y[j];
					y[j]=t;
				}
			}
		}
		for(int x:y) {
			System.out.print(x+" ");
		}
	}

}
