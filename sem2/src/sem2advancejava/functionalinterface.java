//functional interface using lambda expression
package sem2advancejava;
interface Add{
	int addition(int a,int b);
}

public class functionalinterface {
	public static void main(String[]args) {
		Add add=(a,b)->a+b;//lambda expression
		int result=add.addition(10,20);
		System.out.println(result);
	}

}
