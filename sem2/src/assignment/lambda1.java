package assignment;
//Write a java program using a lambda expression to compare two integers and return the greater number
import java.util.*;
interface Maxnumber{
	int max(int a,int b);
}
interface Checkbetween{
	boolean check(int num,int start,int end);
}


public class lambda1 {
  
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Maxnumber max2=(a,b)->(a>b)?a:b;
         // int result=max2.max(10,20);
          //System.out.println(result);
          System.out.println(max2.max(10, 20));
          
          List<String>names=Arrays.asList("aa,bb,cc");
          names.forEach(n->System.out.println(n.toUpperCase()));
          
          Checkbetween c=(start,num,end)->num>start&&num<end;
          System.out.println(c.check(10,6,40));
          
          List<Integer>numbers=Arrays.asList(1,4,3,6);
          Collections.sort(numbers,Collections.reverseOrder());
          System.out.println(numbers);
          
          
          
	}

}
