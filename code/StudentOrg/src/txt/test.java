package txt;

public class test {
    public static void main(String[] args) {

        Student student1=new Student(1,"阿鲁");
        Student student2=new Student(2,"阿鲁");
        Student student3=new Student(3,"阿鲁");


        Student stu[]={student1,student2,student3};

        StudentServie studentServie=new StudentServie(stu);
        studentServie.start();
    }
}
