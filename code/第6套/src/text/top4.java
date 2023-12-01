package text;
public class top4 {
	public String replaceA(String str) {
		if(str.startsWith("ab")) {
			return "替换前缀后的字符串为："+str.replace("ab", "ef");
		}else if(!str.startsWith("ab") && str.endsWith("cd")) {
			return "替换cd后的字符串为："+str.replaceAll("cd", "gh");
		}else {
			return "大写字母的字符串为："+str.toUpperCase();
		}
	}
}
