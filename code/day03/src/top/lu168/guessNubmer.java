package top.lu168;

import java.util.Random;
import java.util.Scanner;

public class guessNubmer {
    public static void main(String[] args) {
        guessNubmer();
    }
    public static void guessNubmer(){
        /*召唤Scanner*/
        Scanner sc=new Scanner(System.in);
        /*召唤Random产生随机数*/
        Random r=new Random();
        /*产生随机数*/
        int randerNumber= r.nextInt(100)+1;/*随机数范围1-100*/

        while(true){
            System.out.println("请输入你猜的数字：");
            int scNumber=sc.nextInt();
            if(scNumber>randerNumber){
                System.out.println("猜大了");
            }else if (scNumber<randerNumber){
                System.out.println("猜小了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("恭喜！");
    }
}
