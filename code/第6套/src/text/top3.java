package text;
public class top3 {
	public String Getprofit(int x) {
		double ret =0.0;
		if(x>=10&&x<=20) {
			ret = x*0.075;
		}else if(x<=40) {
			ret = x*0.05;
		}else if(x<=60) {
			ret = x*0.03;
		}else if(x<=100) {
			ret = x*0.015;
		}else {
			ret =x*0.01;
		}
		return "总提成："+ret+"万";
	}
}
