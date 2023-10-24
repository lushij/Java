package soc;

public class top1 {
	public String top(int a,int b) {
		if(a<=0 || b<=0) {
			return "输入不符合要求";
		}else if(a==b) {
			return "可以构建圆形或正方形";
		}else if((a-b)*(a-b)>4 && (a-b)*(a-b)<=25) {
			return "可以构建椭圆";
		}else if((a-b)*(a-b)>25) {
			return "可以构建矩形";
		}else if((a-b)*(a-b)>0 && (a-b)*(a-b)<=4) {
			return "可以构建长方形";
		}
		return null;
	}
}
