package unit1;
class F{
	int x=10;
	F(){
		this(10);
		System.out.println("inside parent constructor");
	}
	F(int x){
		System.out.println("parameterized constructor");
	}
	void show() {
		System.out.println("parent class F");
	}
}
class E extends F{
	int y=67;
	
	E(){
		super(56);
		System.out.println("inside child constructor");
	}

	
	void display() {
		//super.show();
        System.out.println(super.x);//superkeyword in method
    	System.out.println("class E");
	}
}
public class superkeyword{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //   E b=new E();
       //b.display();
        F f= new F();
        
	
	}
}
