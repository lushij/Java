package topic;

public class top3 {
	public String mail(String usr,String pwd) {
		if(!usr(usr)) {
			return "用户名不符合要求";
		}else if(!pwd(pwd)) {
			return "密码不符合要求";
		}else {
			return "信息正确";
		}
	}
	public boolean usr(String usr) {
		return usr.matches("^[A-Za-z]{5}@(163|126)\\.(com|com\\.cn)");// \\转移字符
	}
	public boolean pwd(String pwd) {
		return pwd.matches("\\d{6}$");
	}

}








































//$YnUY5uvQIY8C3e5dFJZ23bIKb7pLF/dhVP/mtvdE1R7gEjQtjKk8nvz58IEOQefn.229VCfQZn38ldOStLE1w1
//$YnUY5uvQIY8C3e5dFJZ23bIKb7pLF/dhVP/mtvdE1R7gEjQtjKk8nvz58IEOQefn.229VCfQZn38ldOStLE1w1