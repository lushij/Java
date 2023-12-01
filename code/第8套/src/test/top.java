package test;

public class top {
	public String top1(int x,int y) {
		double j=0;
		if(x>60 && y<35) {
			j=10*x-y;
			return "j1=:"+j;
		}else {
			if(x==25 && y>50) {
				j= y*Math.log(x+10);
				return "j3=:"+j;
			}
			else {
				j=(x-y)*(100000%7);
				return "j2=:"+j;
			}
		}
		
	}


	public String top2(int x,int y) {
		int a=0;
		if(x>=80 && y>=60) {
			if(!(x>=90 || y>=90) ){
				a=2;
			}
		}else {
			if(x<=70 || y<=70) {
				a=3;
			}else {
				a=4;
			}
		}
		return "a=x:"+a; 
	}


	public String top3(String name,String phone,String address) {
		if(!isTrueTell(phone)) {
			return "手机号不符合要求";
		}
		else if(!isTrueArr(address)) {
			return "地址不符合要求";
		}else {
			return "OK";
		}
	}
	public boolean isTrueTell(String tell) {
		return tell.matches("\\d{11}");
	}
	public boolean isTrueArr(String address) {
		return address.matches("^[a-zA-Z0-0]{10}$");
	}
	

	public String top4(String usr ,String passwd)
	{
		if(usr.isEmpty() && passwd.isEmpty()) {
			return "用户名或密码不能为空";
		}else {
			if(usr.equals("admin")&& passwd.equals("123"))
			{
				return "登录成功";
			}else if(usr.equals("admin") && !passwd.equals("123")) {
				return "请输入正确的密码";
			}else if(!usr.equals("admin") && passwd.equals("123")) {
				return "请输入正确的用户名";
			}else {
				return "请输入正确的用户名和密码";
			}
		}
	}

}
