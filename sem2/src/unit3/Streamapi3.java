package unit3;

import java.util.Arrays;
import java.util.List;

public class Streamapi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            List<Integer> l1=List.of(10,30,45,56,10,6,34,30);
            l1.stream().distinct().forEach(System.out::println);//distinct remove duplicate
            List<Integer>l2=l1.stream().distinct().toList();//another way to print list
            List<Integer>l3=l1.stream().skip(3).toList();// skip() is use to skip starting elemnts of list , can be used with distinct
            List<Integer>l4=l1.stream().distinct().skip(1).limit(4).toList();//to apply limit to list, how many should print
            System.out.println(l2);
            System.out.println(l3);
            System.out.println(l4);
            
            long c1=l1.stream().distinct().skip(1).limit(4).count();//count is used to count the string
            System.out.println(c1);
            
            long c=l1.stream().count();// toList and count both are terminal , only one can be used 
            System.out.println(c);
            
           Object ar[]=l1.stream().toArray();//toArray
           System.out.println(Arrays.toString(ar));
	}

}
