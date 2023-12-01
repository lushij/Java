package 练习3;

public class demo1201 {
	public String Mail(String usr,String psd) {
		if(IsTrueUsr(usr) && IsTruePsd(psd)) {
			return "信息正确";
		}else {
			if(!IsTrueUsr(usr)){
				return "用户名不符合要求";
			}else
			{
				return "密码不符合要求";
			}
		}
	}
	public boolean IsTrueUsr(String usr) {
		return usr.matches("^[a-zA-Z]{5}@(163|126)\\.(com|com\\.cn)$");
	}
	public boolean IsTruePsd(String psd) {
		return psd.matches("\\d{6}");
	}
}
