package unit1;

class student{
	int id;
	String name;
	student(){ // no arg constructor
		System.out.println("no-argument constructor");
		id=23;
	}
	//parameterised constuctor
	student(int id,String name){
		this.id=id;
		this.name=name;
		System.out.println(id+" "+name);
	}
	//copy constructor
	student(student s){
		this.id=s.id;
		this.name=s.name;
		System.out.println("copy value = "+ id + " , "+name);
	}
}
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       student s1=new student();
       System.out.println(s1.id);
       student s2=new student(101,"alex");
	  student s3=new student(s2);
	}
	

}
