package stop;

public class top1 {
	public static String top(int x,int y) {
		int j=0;
		if(x>60 && y<35) {
			j=10*x-y;
		}
		else {
			if(!(x==25 && y>50)) {
				j=(x-y)*((int)Math.pow(10, 5)%7);
			}else {
				j=y*((int)Math.log(x+10));
			}
		}
		String ret=Integer.toString(j);
		return ret;
	}
}
