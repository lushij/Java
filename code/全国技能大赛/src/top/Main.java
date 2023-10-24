package top;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String ret = new top1().top1(-1, -5);
		System.out.println(ret);
		if(ret.startsWith("x=a-b的值：5")) {
			System.out.println(1);
		}
	}
	public  String top1(int a,int b) {
		int x=0;
		if(a>9 && b>5) {
			x=a*a*b;
			return "x=a*a*b的值："+x;
		}else {
			if(a<0 && b<0) {
				x=a-b;
//				return x+"="+(a-b)+"的值："+x;
				return "x=a-b的值："+x;
			}else {
				x=a+b;
				return "x=a+b的值："+x;
			}
		}
		
	}
}
