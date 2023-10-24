package soc;

public class top3 {
	public String top3(String usr,String pwd) {
		if(isTrueUsr(usr) && isTruePwd(pwd)) {
			return "注册成功";
		}else if(!isTrueUsr(usr) && isTruePwd(pwd)) {
			return "用户名不符合要求";
		}else {
			return "密码不符合要求";
		}
	}
	public boolean isTrueUsr(String usr) {
		return usr.matches("^[a-zA-Z]{8}$");
	}
	public boolean isTruePwd(String pwd) {
		return pwd.matches("\\d{6,}");
	}
}
