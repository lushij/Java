package soc;

public class top2 {
	public String top2(char x,char y) {
		switch(x) {
		case 'M':
			return "周一";
		case 'W':
			return "周三";
		case 'F':
			return "周五";
		case 'T':
			if(y=='u') {
				return "周二";
			}else if(y=='h') {
				return "周四";
			}
		case 'S' :
			if(y=='a') {
				return "周六";
			}else {
				return "周日";
			}
		
		}
		return null;
	}
}
