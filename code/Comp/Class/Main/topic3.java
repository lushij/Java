package Main;

public class topic3 {
	public String Quaaddr(String name,String num,String addr) {
		if(num.length() !=11 ) {
			return "手机号不符合要求";
		}
		if(!addr.matches("[A-Za-z0-9]{1,10}")) {
			return "地址不符合要求";
		}
		return "OK";
	}
	
	
	//example2
	public String Quaaddr2(String name,String num,String addr) {
		if(num.length() !=11 ) {
			return "手机号不符合要求";
		}
		if(!((addr.charAt(0)>='a' && addr.charAt(0)<='z')||
				addr.charAt(0)>='A' && addr.charAt(0)<='Z')) {
			return "地址不符合要求";
		}
		return "OK";
	}
}