//use foreach method to print string with exclamation mark appended
package sem2advancejava;
import java.util.*;

public class foreachmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> l2=new ArrayList<>();
       l2.add("Alex");
       l2.add("hi");
       l2.forEach(s->System.out.println(s+"!"));
       l2.forEach(s->System.out.println(s.toUpperCase()));
       l2.forEach(s->System.out.println("hello" + s));
       l2.forEach(s->System.out.println(s.startsWith("A")));
       l2.forEach(s -> {
    	    if (s.length() > 5) {
    	        System.out.println(s);
    	    }
    	});

       l2.forEach(System.out::println);
	}

}
