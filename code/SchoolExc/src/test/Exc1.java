package test;

import java.util.*;

public class Exc1 {
	public static void main(String[] args) {
		int num = 1000;
		while (num-- > 100) {
			int x = num % 10;
			int y = num / 10 % 10;
			int z = num / 100 % 10;
			int sum = x * x * x + y * y * y + z * z * z;
			if (sum == num) {
				System.out.println(sum);//水仙花数
			}

		}
	}
}
