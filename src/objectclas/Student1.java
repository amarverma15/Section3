package objectclas;

public class Student1 {
	int id,age;
	String name;
	public Student1(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public int hashCode() {
		return id;
	}
	public static void main(String[] args) {
		Student1 s1=new Student1(101,"Aaa",30);
		Student1 s2=new Student1(102,"abc",23);
		Student1 s3=new Student1(101,"cfd",32);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
