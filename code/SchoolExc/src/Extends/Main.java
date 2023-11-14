package Extends;

class Tea{
	private
		String name;
		int age;	
	public Tea(String name,int age){
			this.name=name;
			this.age=age;
		}
		public Tea() {
		// TODO 自动生成的构造函数存根
	}
		String getName() {return this.name;}
		int getAge() {return this.age;}
}
class students extends Tea{

	public students(String name, int age) {
			super(name, age);
		}
	public void PrintTail(){
		System.out.println(this.getName()+this.getAge());
	}
}
public class Main {
	public static void main(String[]args) {
		Tea teacher = new Tea("laoshi",20);
		Tea st=new students("st",22);
		System.out.println(st.getName());
		int cnt=(int)Math.log(10);
		System.out.println(cnt);
	}
}
