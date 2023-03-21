package txt;

import java.util.Scanner;

public class StudentServie {

    private Scanner sc = new Scanner(System.in);
    private Student[] stu;
    public StudentServie(Student[] stu) {
        this.stu=stu;
    }

    /*
     *
     * 启动选项*/
    public void start() {


        lo:
        while (true) {
            System.out.println("------学生信息管理系统------");
            System.out.println("请输入的你选择：");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据ID查询信息");
            System.out.println("3.退出");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queryStu();
                    break;

                case 2:
                    queyDet();
                    break;

                case 3:
                    System.out.println("感谢使用，再见！");
                    break lo;
                default:
                    System.out.println("输入有误，请检查");
                    break;


            }
        }

    }

    //此方法根据ID输出信息
    private void queyDet() {

        //1.键盘录入
        System.out.println("请输入查询编号：");
        int id= sc.nextInt();
        //2.遍历数组
        for (int i = 0; i < stu.length; i++) {
            Student student = stu[i];

            if(student.getId()==id)
                //找到了并打印
                System.out.println(student.getId()+"---"+student.getName());
        }

    }

    //此方法输出全部信息
    private void queryStu() {
        //遍历数组，取出每一个对象
        for (int i = 0; i < stu.length; i++) {
            Student student = stu[i];
            //System.out.println(stu);  打印对象名，看到是对象内存地址
            //通过学生对象，调用内部getXXX方法 获取信息并打印
            System.out.println(student.getId()+"---"+student.getName());
        }
    }


}