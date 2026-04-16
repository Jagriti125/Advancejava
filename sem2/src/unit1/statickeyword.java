//static member belong to class not to object
//directly access without object
//used to manage memory(memory allocated only one time to static variable and shared between objects)
package unit1;
class Student1{
	int id;
	String name;
	static String college="KIET";//static variable
	
	Student1(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println("id="+id+"name="+name + " college="+ college);
	}
}
public class statickeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student1 s=new Student1(1,"ram");
    s.display();
    Student1 s2=new Student1(2,"sita");
    s2.display();
    s.college="kiet deemed to be university";
    s.display();
    s2.display();
    System.out.println(Student1.college);
	}

}
