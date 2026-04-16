package sem2advancejava;
import java.util.*;

public class foreachmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> l=new ArrayList<>();
      l.add(34);
      l.add(67);
      l.add(10);
      l.add(45);
      l.add(56);
       l.forEach(i->System.out.println(i));
     //for method referencing
       //1.forEach(System.out::println);
	//for even number printing
       l.forEach(i->{
       if(i%2==0) {
    	   System.out.println(i);
       }
	});
}
}
