import java.util.Scanner;

public class StudentStart {



    private Student []stu;
    private Scanner sc= new Scanner(System.in);


    public void start(){

        lo:
        while(true){
        System.out.println("-------学生信息管理系统------");
        System.out.println("请输入的你选择：");
        System.out.println("1.查询全部电影信息");
        System.out.println("2.根据ID查询信息");
        System.out.println("3.退出");

            int choice= sc.nextInt();

            switch (choice){
                case 1:

                    break;

                case 2:

                    break;

                case 3:
                    System.out.println("感谢使用，再见！");
                    break;
                default:
                    

            }


    }
}
