package Class;
import java.util.*;
public class Topic {
	public int topic1(int x,int y) {
		Scanner sc = new Scanner(System.in);
		int a;
		if(x>=80 && y>=60) {
			if(x>=90 || y>=90)
			{		
				return 0;
			}
			else {
				a=2;
			}
		}
		else {
			if(x<=70 || y<=70) {
				a=3;
			}
			else {
				a=4;
			}
		}
		return a;
	}
	

	public String topic2(int year,int month) {
		int day=0;
		if(month <=0 || month >12 )
		{
			return "月份输入不正确";
		}else {
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			case 2:
				if(((year % 100 !=0) && (year % 4 ==0))|| year%400==0) {
					day = 29;
				}else {
					day = 28;
				}
				break;
			}
			
		}
		return year+"年"+month+"月份的天数是"+day+"天";
		
	}

	public String topic3(String num,String addr) {
		if(num.length()!=11) {
			return "手机号不符合要求";
		}
		if(!addr.matches("[A-Za-z0-9]{1,10}")) {
			//matches("[A-Za-z0-9]{1,10}")是一个正则表达式，用于验证字符串是否满足特定的模式。
			//在这个正则表达式中，[A-Za-z0-9]表示可以是任意字母（大小写不限）或数字。{1,10}表示前面的字符可以重复出现1到10次，即字符串长度在1到10之间。
			return "地址不符合要求";
		}
		return "OK";
	}


	public String topic4(String str) {
		if(str.startsWith("ab")) {
			String replace=str.replace("ab", "ef");
			return "替换前缀后的字符串为："+replace;
		}
		if(str.endsWith("cd") && !str.startsWith("ab")){
			String replace=str.replaceAll("cd", "gh");//替换所有
			return "替换cd后的字符串为："+replace;
		}
		return "大写字母的字符串为："+str.toUpperCase();
		
}
