package main;

public class top1 {
	public String top(String usr,String pwd) {
		if(!isTrueUsr(usr)) {
			return "用户名不符合要求";
		}else if(!isTruePwd(pwd)) {
			return "密码不符合要求";
		}else {
			return "注册成功";
		}
	}
	public boolean isTrueUsr(String usr) {
		return usr.matches("^[a-zA-Z]{8}$");
	}
	public boolean isTruePwd(String pwd) {
		return pwd.matches("//d{6,}");
	}
}
