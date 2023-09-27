package works_01;

import java.util.Scanner;

public class rate {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入纳税人的类型：0-单身 ，1-已婚 ，2-家庭");
        int status=in.nextInt();
        double income;//收入
        double tax=0.0;//缴纳的钱数

        switch(status)
        {
            case 0:
                System.out.println("接下来是单身人士的纳税系统");
                System.out.println("请输入你的收入");
                income=in.nextDouble();
                tax=calctx0(income);
                break;

            case 1:
                System.out.println("接下来是已婚人士的纳税系统");
                System.out.println("请输入你的收入");
                income=in.nextDouble();
                tax=calctx1(income);
                break;
            case 2:
                System.out.println("接下来是人士家庭的纳税系统");
                System.out.println("请输入你的收入");
                income=in.nextDouble();
                tax=calctx2(income);
                break;
        }
        System.out.println(tax);
    }
    public static double calctx0(double income)
    {

        if(income <= 6000)
        {
            return income*0.1;
        }
        else if(income<=27950)
        {
            return income*0.15;
        }
        else if(income <=67700)
        {
            return income*0.27;
        }
        else if(income<=141250)
        {
            return income*0.30;
        }
        else
        {
            return income*0.35;
        }
    }
    public static double calctx1(double income)
    {
        int pf=2;

        if(income <= 6000*pf)
        {
            return income*0.1;
        }
        else if(income<=27950*pf)
        {
            return income*0.15;
        }
        else if(income <=67700*pf)
        {
            return income*0.27;
        }
        else if(income<=141250*pf)
        {
            return income*0.30;
        }
        else
        {
            return income*0.35;
        }
    }
    public static double calctx2(double income)
    {
        int pf=4000;
        if(income <= 6000+pf)
        {
            return income*0.1;
        }
        else if(income<=27950+pf)
        {
            return income*0.15;
        }
        else if(income <=67700+pf)
        {
            return income*0.27;
        }
        else if(income<=141250+pf)
        {
            return income*0.30;
        }
        else
        {
            return income*0.35;
        }
    }
}
