package test;

import java.util.*;

public class Exc2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		if (grade >=0 && grade <= 100) {
			int x = grade / 10;
			String gra = null;
			switch (x) {
			case 10:
			case 9:
				gra = "A";
				break;
			case 8:
				gra = "B";
				break;
			case 7:
				gra = "C";
				break;
			case 6:
				gra = "D";
				break;
			default:
				gra="不及格";
			}
			System.out.println("等级为：" + gra);
		}

	}

}
