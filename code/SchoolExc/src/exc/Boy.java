package exc;

public class Boy {
	private String name;
	private int age;
	Boy(){this.age=20;this.name=name;}
	Boy(String name,int age){
		this.age=age;
		this.name=name;
	}
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	int getAge() {
		return this.age;
	}
	String getName() {
		return this.name;
	}
	void infoShow() {
		System.out.println("name:"+this.name+" age:"+this.age+" this:"+this);
	}
}
