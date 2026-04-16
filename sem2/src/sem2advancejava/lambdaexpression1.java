//lambda expression with zero parameter
package sem2advancejava;
@FunctionalInterface
interface ZeroParameter{
	void display();
}	
	interface Withreturn{ //zero parameter with return 
		public String display();
	
}

public class lambdaexpression1 {
public static void main(String[]args) {
	ZeroParameter zp=()->
	System.out.println("Zero parameter lambda expression");//if  multiple statements are there, need to use curly bracket in system.out.println with ; at the end 
	//ZeroParameter zp=()->{
	//System.out.println("hello");
	//System.out.println("java");
	//return "world";
//};
//	String s=n.display();
//	System.out.println(s);
	//zp.display();
	
	Withreturn zp1=()->{return "hello world";};
	String s=zp1.display();
	System.out.println(s);
}
}
