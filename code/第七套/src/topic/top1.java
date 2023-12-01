package topic;
public class top1 {
	public String Xy(int x,int y) {
		if(x<=0 || y<=0) {
			return "输入不符合要求";
		}else {
			if(x==y) {
				return "可以构建圆形或正方形";
			}else if((x-y)*(x-y)>=4 && (x-y)*(x-y)<=25 ) {
				return "可以构建椭圆";
			}else if((x-y)*(x-y)>0 && (x-y)*(x-y)<=4) {
				return "可以构成长方形";
			}else {
				return "可以构成矩形";
			}
		}
	}
}
