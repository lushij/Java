package TestMain;

import java.util.*;

public class Main {

	class People {
		String name;
		int i;
	}

	public String logAdmin(String name, String password) {
		// 登录过程
		if ("admin".equals(name) && "123456".equals(password)) {
			return "登录成功";
		} else {
			return "登录失败";
		}
	}

	public int ReadPeople(String name, int m) {		
		People man=new People();
		man.i=1;
		man.name="name1";
		if(man.name.equals(name) && m==man.i) {
			return 1;
		}
		return 0;
	}
}
