package unit3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class intermediateoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Integer> list=new ArrayList<>();
		List<Integer>l4=new ArrayList<>();
        l4.add(45);
        l4.add(89);
        l4.add(23);
        l4.add(70);
        //Stream<Integer> s4=l4.stream();
        //List<Integer>l5=s4.filter(x->x%2==0).collect(Collectors.toList()); //terminary operation we can use are forEach and Collect(is used to collect data in list)
        List<Integer>l5=l4.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(l5);
        l4.stream().filter(x->x%2==0).forEach(x->System.out.println(x));//forEach
        
        List<Integer>l7=l4.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList());//map(can be used with filter or without filter)
	}

}
