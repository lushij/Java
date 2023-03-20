public class Studenttest {
    public static void main(String[] args) {

        Student stu=new Student();


        //未初始化时打印的
        System.out.println(stu);


        stu.name="乐乐";
        stu.age=19;
        System.out.println("姓名是："+stu.name+"---"+"年龄是："+stu.age);
    }
}
