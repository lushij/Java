package top;

public class top3 {
	public String top3(String usr,String pwd) {
		if(isTrueUser(usr)&&isTruePwd(pwd)) {
			return "信息正确";
		}else {
			if(!isTrueUser(usr)) {
				return "邮箱地址不符合要求";
			}else if(!isTruePwd(pwd)) {
				return "密码不符合要求";
			}
		}
		return null;
	}
	public boolean isTrueUser(String user) {
		String cmp="^[a-zA-Z]{5}@(163|126)\\.(com|com\\.cn)$";
		return user.matches(cmp);
	}
	
	public boolean isTruePwd(String pwd) {
		return pwd.matches("\\d{6,}");//  \\表示转义字符 \\d表示匹配数字字符
	}
}
