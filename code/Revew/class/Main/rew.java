package Main;

//public class rew {
//	public static int topic1(int a) {
//		if(a>0) return a;
//		else return -a;
//	}
//}

import java.util.Scanner;

public class rew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if (str.equals(".")) break;

            int n = str.length();
            for (int i = 1; i <= n; i ++ )
                if (n % i == 0) {
                    String s = str.substring(0, i);
                    String r = "";
                    for (int j = 0; j < n / i; j ++ )
                        r += s;
                    if (r.equals(str)) {
                        System.out.println(n / i);
                        break;
                    }
                }
        }
    }
}

