package top;

public class top2 {
	
	//判断是否为闰年
	public String top2(int year,int month) {
		if(month<0 || month>12)
		{
			return "输入的月份不正确";
		}
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return year+"年"+month+"月份的天数是31天";
		case 4:
		case 6:
		case 9:
		case 11:
			return year+"年"+month+"月份的天数是30天";
		case 2:
			if((year%400==0) || (year % 100!=0 && year % 4==0))
			{
				return year+"年"+month+"月份的天数是29天";
			}else {
				return year+"年"+month+"月份的天数是28天";
			}
		}
		return null;
	}

	public boolean top3(int year) {
		if(year % 400 ==0 || (year % 4==0 && year %100!=0)) {
			return true;
		}else {
			return false;
		}
	}
}
