package 练习;

public class demo {
	public String MailPsd(String usr,String psd) {
		if(IsUsr(usr)&&IsPsd(psd)) {
			return "登录成功";
		}else {
			if(!IsUsr(usr)){
				return "用户名不正确";
			}else {
				return "密码不正确";
			}
		}
	}
	boolean IsUsr(String usr) {
		return usr.matches("^[a-zA-Z]{5}@(163|126)\\.(com|com\\.cn)");
	}
	boolean IsPsd(String psd) {
		return psd.matches("\\d{6}$"); //   \\转移字符
	}
}
