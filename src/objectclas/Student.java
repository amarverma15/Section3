package objectclas;

public class Student {
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "name is " +name+"\n age is "+age; 
	}
	@Override
	public boolean equals(Object o) {
		Student s=(Student)o;
		return this.id==s.id;

	}
	public static void main(String[] args) {
		Student s1=new Student(101,"abc",23);
		System.out.println(s1);
		Student s2=new Student(102,"def",23);
		System.out.println(s2);
		Student s3=new Student(101,"ghj",22);
		System.out.println(s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
	}

}
