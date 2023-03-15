package top.lu168;

import java.util.Scanner;

public class opreate {
    public static void main(String[] args) {
        getmax();
    }

    public static void getmax(){
        int sum=0;
        int arr[]=new int[5];/*动态数组初始化*/
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <5; i++) {
             arr[i]=sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}
