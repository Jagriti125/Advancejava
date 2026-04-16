package sem2advancejava;
interface Mathoperation{
	int square(int x);
}
interface Maxtwo{
	int max(int x,int y);
}
interface Joinstring{
	String join(String x, String y);
}
interface Divisibilityby3{
	boolean check3(int x); 
}
interface CheckNumber{
	boolean isGreaterThanTen(int n);
}
interface Nostring{
	String display();
}
interface IsPositive{
	boolean ispos(int x);
}

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Mathoperation m1=(a)->{return a*a;};
         System.out.println("Square of 6:"+m1.square(6));
        		Maxtwo m2=(a,b)->{return Math.max(a,b);};
        		System.out.println("Max of 3 and 5:"+m2.max(3, 5));
	   Joinstring m3=(a,b)->{return a+b;};
	   System.out.println("Concat two string:"+m3.join("hello", "java"));
	   Divisibilityby3 m4=(a)->{
		   if(a%3==0) {
			   return true;
			    }else {
			    	return false;
			    }
	   };
	   System.out.println("divisibility of 3:"+m4.check3(5));
	   CheckNumber m5=(a)->{
		   if(a>10) {
			   return true;
		   }else {
			   return false;
			   
		   }
	   };
	   Nostring m6=()->{return "hello";};
		   System.out.println("string:"+m6.display());
		   IsPositive m7=(a)->{
			   if(a>0) {
				   return true;
			   }else {
				   return false;
			   }
	   };
	   System.out.println("Giver number is positive or not:"+m7.ispos(-5));
	}

}
