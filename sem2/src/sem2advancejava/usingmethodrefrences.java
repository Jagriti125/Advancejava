
package sem2advancejava;
interface int1{
	void show();
}

class Demo{
	//method should always be static
	public static void display() {
		System.out.println("refrence to static method");
	}
	void show1() {
		System.out.println("world");
	}
}
public class usingmethodrefrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to call non static method of class we need to create class object first
		Demo u1=new Demo();
		int1 i2=u1::show1;
		i2.show(); 
		//calling static method of class by class name
         int1 i1=Demo::display;
         i1.show();
	}

}
