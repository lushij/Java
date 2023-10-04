package CalcProject;

public class Sum1_100 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		for(int i=1;i<=100;++i) {
//			if(i%3==0 || i%4==0) {
//				System.out.print(i+" ");
//			}
//		}
//		System.out.println();
//		for(int i=200;i<=300;++i) {
//			if(i%5==0 || (i%2==0 && i%3==0))
//			{
//				System.out.print(i+" ");
//			}
//		}
		int count=0;
		for(int i=1;i<=2000;++i) {
			if((i%4==0 && i%100!=0)||i%400==0) {
				System.out.print(i+" ");
				count++;
				if(count==30) {
					System.out.println();
					count=0;
				}
			}
		}
	}

}
