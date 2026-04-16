package unit3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //first way to make stream using array     
		int arr[]= {3,4,7,89,73,80};
             IntStream s=Arrays.stream(arr);
             s.forEach(x->System.out.println(x));
            		
	//second way using values
             Stream<Integer>s2=Stream.of(2,6,45,34);  //Stream.of is used to directly convert values into stream
             s2.forEach(x->System.out.println(x));
             
             //third waay using collection(most used way)
             List<Integer> l3=new ArrayList<>();
             l3.add(45);
             l3.add(83);
             l3.add(23);
             Stream<Integer> s3=l3.stream(); // use to convert collections to stream
             s3.forEach(x->System.out.println(x));
	}

}
