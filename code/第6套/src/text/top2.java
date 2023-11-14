package text;

public class top2 {
	public String top(int a,int b,int c) {
		if(!a(a) || !b(b) || !c(c))
		{
			return "输入边值不在范围内";
		}else {
			if(!(a+b>c) || (!(a+c>b)) || (!(b+c>a))) {
				return "输入边值不能组成三角形";
			}else {
				if(a==b || b==c || a==c) {
					return "能组成等腰三角形";
				}else if(a==b && b==c) {
					return "等边三角形";
				}else {
					return "能组成普通三角形";
				}
			}
		}
	}
	public boolean a(int a) {
		return a<=10&&a>=1;
	}
	public boolean b(int b) {
		return b<=10&&b>=1;
	}
	public boolean c(int c) {
		return c<=10&&c>=1;
	}
}
