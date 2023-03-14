import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int max=getmax(num,10);
        System.out.println("最大值为："+max);

    }

    public static  int getmax(int num1,int num2){
        int max=num1>num2?num1:num2;
        return max;
    }
}
