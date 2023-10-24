package top;

public class top4 {
	public String top4(String usr,String pwd) {
		if(usr.isEmpty() && pwd.isEmpty()) {
			return "用户名和密码不能为空";
		}else if(usr.equals("admin") && pwd.equals("123")) {
			return "登录成功";
		}else if(!usr.equals("admin") && pwd.equals("123")) {
			return "请输入正确的用户名";
		}else if(usr.equals("admin") && (!pwd.equals("123"))) {
			return "请输入正确的密码";
		}else {
			return "请输入正确的用户名和密码";
		}
	}
}
