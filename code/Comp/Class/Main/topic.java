package Main;

public class topic {
	public int topic1(int x,int y) {
		int a=0;
		if(x>=80 && y>=60) {
			if(x>=90 || y>=90) {
				return 0;
			}else {
				a=2;
			}
		}else {
			if(x<=70 || y<=70) {
				a=3;
			}else {
				a=4;
			}
		}
		return a;
	}


	public String topic2(int year,int month) {
		int day=0;
		if(month<=0 || month>12) {
			return "月份输入不正确";
		}else {
			
			switch(month) {
			case 2:
				if((year % 400 == 0) ||((year % 4==0)&&(year %100!=0))) {
					day = 29;
				}else {
					day=28;
				}
				break;
			case 1:	case 3:case 5:case 7:case 8:case 10:case 12:
				day = 31;
				break;
			default:
				day=30;
				break;
			}
		}
		return year+"年"+month+"月份的天数是"+day+"天";
	}

}
