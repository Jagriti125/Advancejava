//sorted(),compareTo(),min(),max()
package unit3;
import java.util.*;
public class Streamapi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer>l1=List.of(34,56,23,56,89,12);
      List<Integer>l2= l1.stream().sorted().toList();
     System.out.println(l2);
      List<Integer>l3= l1.stream().sorted(Comparator.reverseOrder()).toList();//for descending order
      System.out.println(l3);
      List<Integer>l4=l1.stream().sorted((x,y)->y.compareTo(x)).toList();//for compare and then sorted in descending order
      System.out.println(l4);
      List<Integer>l5=l1.stream().sorted((x,y)->x.compareTo(y)).toList();//for ascending order
      System.out.println(l5);
      int minimum=l1.stream().min((x,y)->x.compareTo(y)).get();//for minimum 
      System.out.println(minimum);
      int maximum=l1.stream().max((x,y)->x.compareTo(y)).get();//for maximum
      System.out.println(maximum);
	}

}
