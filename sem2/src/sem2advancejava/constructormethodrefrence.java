//reference to a constructor in method reference
package sem2advancejava;
interface MyInterface1{
	Student get();

}
class Student{
	Student(){
		System.out.println("student object created");
	}
}

public class constructormethodrefrence {
public static void main(String[]args) {
	MyInterface1 ref=Student::new;
	ref.get();
}
}
