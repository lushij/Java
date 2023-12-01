package 练习2;

public class Demo {
	public String MailPsd(String usr,String psd) {
		if(IsUsr(usr) && IsPsd(psd)) {
			return "登陆成功";
		}else {
			if(!IsUsr(usr)) {
				return "用户名不正确";
			}else {
				return "密码错误";
			}
		}
	
	}
	public boolean IsUsr(String usr) {
		return usr.matches("^[a-zA-Z]{5}@(163|126)\\.(com|com\\.cn)$");
	}
	public boolean IsPsd(String psd) {
		return psd.matches("\\d{6}$");
	}
}
