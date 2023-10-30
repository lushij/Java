package sr;

public class tp1 {
	public String runnian(int year,int month) {
		int days=0;
		switch(month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			days=31;
			break;
		case 4:case 6:case 9:case 11:
			days=30;
			break;
		case 2:
			if(year % 400==0 || (year % 4==0 && year % 100==0)) {
				days=29;
				
			}else {
				days=28;
			}
		}
		return year+"年的"+month+"月份的天数为："+days+"天";
	}
}
