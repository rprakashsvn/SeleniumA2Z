package CollectionsJava;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
	int Id;
	String name;
	int age;

	Employee(int Id, String name, int age) {
		this.Id = Id;
		this.name = name;
		this.age = age;
	}
}

public class UserDefinedClassUsingArray {

	public static void main(String[] args) {

		Employee s1 = new Employee(485, "Prakash", 26);
		Employee s2 = new Employee(485, "Rajesh", 34);
		Employee s3 = new Employee(485, "Jegadees", 32);

		ArrayList<Employee> studentDetails = new ArrayList<Employee>();
		studentDetails.add(s1);
		studentDetails.add(s2);
		studentDetails.add(s3);

		Iterator<Employee> it = studentDetails.iterator();
		while (it.hasNext()) {
			Employee empInfo = (Employee) it.next();
			System.out.println(empInfo.Id + " " + empInfo.name + " " + empInfo.age);
		}
	}
}
