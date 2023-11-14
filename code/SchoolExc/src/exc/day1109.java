package exc;
import java.util.*;
public class day1109 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name =sc.next();
		int age=sc.nextInt();
		String name1 =sc.next();
		int age1=sc.nextInt();
		Girl girl=new Girl(name,age);
		Boy boy=new Boy(name1,age1);
		girl.infoShow();
		boy.infoShow();

	}

}
