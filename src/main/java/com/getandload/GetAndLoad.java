package com.getandload;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.emabeddable.Employee;
import com.starting.Student;

public class GetAndLoad {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Student std1 = (Student)session.get(Student.class, 2);
		System.out.println(std1.getName()+" : "+std1.getAge());
		System.out.println(std1.getName()+" : "+std1.getAge());
		System.out.println(std1.getName()+" : "+std1.getAge());
		
		Employee emp1 = (Employee)session.load(Employee.class, 101);
		System.out.println("Total_Salary: "+emp1.getSalary().getTotalSalary()+" : "+"Employee_name: "+emp1.getName());
		System.out.println("Increment: "+emp1.getSalary().getIncrement()+" : "+"Employee_name: "+emp1.getName());
		
		/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.starting.Student.getName()" because "std2" is null*/
		Student std2 = (Student)session.get(Student.class, 4);
		System.out.println("Name: "+std2.getName()+" : "+"Age: "+std2.getAge());
		
		/*Exception in thread "main" org.hibernate.ObjectNotFoundException: No row with the given identifier exists: [com.emabeddable.Employee#106]*/
		Employee emp2 = (Employee)session.load(Employee.class, 106);
		System.out.println("Total_Salary: "+emp2.getSalary().getTotalSalary()+" : "+"Employee_name: "+emp2.getName());
		System.out.println("Increment: "+emp2.getSalary().getIncrement()+" : "+"Employee_name: "+emp2.getName());
		
		session.close();
		factory.close();
	}
}
