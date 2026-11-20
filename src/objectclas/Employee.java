package objectclas;

public class Employee {
		int id;
		String name;
		int age;
		public Employee(int id,String name,int age) {
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
			Employee s=(Employee)o;
			return this.id==s.id;

		}
		public static void main(String[] args) {
			Employee e1=new Employee(101,"abc",23);
			System.out.println(e1);
			Employee e2=new Employee(102,"def",23);
			System.out.println(e2);
			Employee e3=new Employee(101,"ghj",22);
			System.out.println(e3);
			System.out.println(e1.equals(e2));
			System.out.println(e1.equals(e3));
		}

}
