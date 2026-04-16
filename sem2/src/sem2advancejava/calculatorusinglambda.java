package sem2advancejava;
interface Calculator{
	int calculate(int x,int y);
}
public class calculatorusinglambda {
	public static void main(String[]args) {
   Calculator add=(a,b)->a+b;
   Calculator sub=(a,b)->a-b;
   Calculator mul=(a,b)->a*b;
   Calculator div=(a,b)->a/b;
   System.out.println("addition="+add.calculate(5,10));
   System.out.println("substration="+sub.calculate(5,10));
   System.out.println("multiplication="+mul.calculate(5,10));
   System.out.println("division="+div.calculate(5,10));
   
}
	
}