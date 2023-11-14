package Extends;

class Point {
	private
		int age;
		String name;
	public Point(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public static void main(String[]args) {
		Point s=new Point("name1",20);
		System.out.println(s.getName());
		Point s1=new stu("name2",22);
		System.out.println(s1.getName());
	}
}
class stu extends Point{
	public stu(String name, int age) {
		super(name, age);
	}
}
