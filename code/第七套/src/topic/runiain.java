package topic;
import java.util.Scanner;
public class runiain {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n=1000;
		while(n<2000) {
			if((n%400==0)||((n%100!=0)&&(n%4==0)))
			{
				System.out.print(n+"\t");
			}
			n++;
		}
	}
}
