package text;
public class topic {
	public int top1(int x,int y) {//函数方法
		int a=0;
		if(x>=80 && y>=60) {//条件
			if(!(x>=90 || y>=90)) {
				a=2;
			}
		}else {//条件
			if(x<=70 || y<=70) {
				a=3;
			}else {
				a=4;
			}
		}
		return a;
	}
}
