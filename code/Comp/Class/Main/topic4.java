package Main;
import java.util.*;
public class topic4 {
	public String Str(String str) {
		String s=null;
		if(str.startsWith("ab")) {
			s=str.replace("ab","ef");
			return "替换前缀后的字符串为："+s;
		}
		if(str.endsWith("cd")) {
			s=str.replaceAll("cd", "gh");
			return "替换cd后的字符串为："+s;
		}
		else {
			s=str.toUpperCase();
			return "大写字母的字符串为："+s;
		}
	}
}
