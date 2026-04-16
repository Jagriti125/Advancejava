package unit3;
import java.util.*;
public class Streamapi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer>l1=List.of(10,34,56,34,78);
        l1.stream().reduce((e1,e2)->e1+e2).ifPresent(System.out::println);//default reduce take two values, so we use lambda for further operation
         //optional is written type of reduce, is used , if stream is null or had element thats why
        //ifPresent if value is present 
       Optional x= l1.stream().reduce((e1,e2)->e1+e2);
       System.out.println(x);
       
       //2nd way(extra value pass which is identity value(starting value))
      int sum= l1.stream().reduce(0,(e1,e2)->e1+e2);//0 is identity value,it chnges according to value, mul=1,string-"" 
       System.out.println(sum);
       int mul=l1.stream().reduce(1,(e1,e2)->e1*e2);//multiply
       System.out.println(mul);
     //  int max=l1.stream().reduce(0,(e1,e2)->e1>e2?e1:e2);//max
        int max=l1.stream().reduce(0,Integer::max);
       System.out.println(max);
       int count=l1.stream().reduce(0,(e1,e2)->e1+1);//count
       System.out.println(count);
       int even=l1.stream().filter(e->e%2==0).reduce(0, (e1,e2)->e1+e2);//even number add 
       System.out.println(even);
       List<String>l2=List.of("ab","abc","dedf","python","java");
       String b=l2.stream().filter(a->a.length()>3).reduce("",(e1,e2)->e1+e2);
       System.out.println(b);
       int odd=l1.stream().filter(e->e%2!=0).reduce(1, (e1,e2)->e1*e2);
       System.out.println(odd);
       String c=l2.stream().reduce("",(e1,e2)->e1+e2);
       System.out.println(c);
       String d=l2.stream().reduce("", (e1,e2)->e1.length()>e2.length() ? e1 : e2);
       System.out.println(d);
       List<Integer>l3=List.of(34,-90,34,23,-9);
       int s=l1.stream().map(a1->a1<0?0:a1).reduce(0,Integer::sum);
       System.out.println(s);
       
       
	}

}
