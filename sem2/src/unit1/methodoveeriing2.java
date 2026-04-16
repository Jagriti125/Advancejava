package unit1;
class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	
	}
}
public class methodoveeriing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Animal a=new Dog();//upcasting
      a.sound();//dynamic method dispatch
	}

}
