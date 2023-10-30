package main;

public class top2 {
	public String top(String str) {
			if(str.startsWith("ab")){
				return "替换前缀后的字符串为："+str.replace("ab", "ef");
			}else if(str.endsWith("cd") && (!str.startsWith("ab"))) {
				return "替换cd后的字符串为："+str.replaceAll("cd", "gh");
			}else {
				return "大写字母的字符串为："+str.toUpperCase();
			}
		}
	}
