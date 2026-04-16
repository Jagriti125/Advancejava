package unit3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int id;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}}
	class Employee{
		String name;
		int id;
		int salary;
		Employee(int id,int salary,String name){
			this.id=id;
			this.name=name;
			this.salary=salary;
		
	}
}
	public class streamapi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<Student>stud=Arrays.asList(
        		  new Student(1,"xyz"),
        		  new Student(2,"abc"),
        		  new Student(3,"alice")
        		  );
          
         List<String>names= stud.stream().map(s->s.name).collect(Collectors.toList());//for only obtaining name from string
         System.out.println(names);
         
        //write a java program to filter employees whose salary is greater than 60,000 and return their names in uppercase using map()
         List<Employee>emp=Arrays.asList(
        		 new Employee(1,20000,"abc"),
        		 new Employee(2,60000,"svg"),
        		 new Employee(3,65000,"alice")
        		 );
         List<String>names1=emp.stream().filter(x->x.salary>60000).map(s1->s1.name.toUpperCase()).collect(Collectors.toList());
         System.out.println(names1);
         //write a java program to filter numbers greater than 20 from a list and multiply each number by 3 using map()
         List<Integer>n1=new ArrayList<>();
        		 n1.add(45);
         n1.add(34);
         n1.add(13);
         List<Integer>l1=n1.stream().filter(x->x>20).map(s2->s2*3).collect(Collectors.toList());
         System.out.println(l1);
         
        		 
	}

}
