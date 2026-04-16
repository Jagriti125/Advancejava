//single level inheritance
package unit1;
class A{
	void show() {
		System.out.println("parent class A");
	}
}
class B extends A{
	void display() {
		System.out.println("class B");
	}
}
//multilevel inheritance
class C extends B{
	void check() {
		System.out.println("class c");
	}
	
}
//hierarchial inheritance
class D extends A{
	void start() {
		System.out.println("class d");
	}
}
public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //single inheritance
		//  B b=new B();
          //  b.show();
         //   b.display();
	//multilevel inheritance
	//	C c=new C();
		//c.show();
		//c.display();
		//c.check();
//hierarchial inheritance
		D d= new D();
		d.show();
		d.start();
		//hybrid inheritance= combination of two types of inheritance
	}
	

}
