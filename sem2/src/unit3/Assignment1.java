package unit3;
import java.util.*;
import java.util.stream.Collectors;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String>l1=List.of("riya","sita","ram","ariya");
       List<String> name=l1.stream().map(a->a).toList();//print string 
        System.out.println(name);
        List<Integer>l2=List.of(45,67,56,78,65);
        List<Integer>greater=l2.stream().filter(x->x>50).toList();//number greater than 50
        System.out.println(greater);
        List<Integer>num=l2.stream().filter(s1->s1>20).toList();// filter positive number greater than 20
        System.out.println(num);
        List<String>A=l1.stream().filter(s->s.startsWith("a")).toList();//string start with a
        System.out.println(A);
        List<String>end=l1.stream().filter(s1->s1.endsWith("a")).toList();//string ends with a
        System.out.println(end);
        List<Integer>positive=l2.stream().filter(s->s>0).toList();//positive number
        System.out.println(positive);
        List<Integer>odd=l2.stream().filter(s->s%2!=0).toList();//odd number
        System.out.println(odd);
        List<String>c=l1.stream().filter(s->s.contains("a")).toList();//string contains letter a
        System.out.println(c);
        List<String>d=l1.stream().filter(a->a.length()>5).toList();//length greater than 5
        System.out.println(d);
        List<Integer>e=l2.stream().filter(s->s%3==0).toList();//divisible by 3
        System.out.println(e);
        List<String>f=l1.stream().map(a->a.toUpperCase()).toList();//convert lowercase to uppercase
        System.out.println(f);
        List<Integer>g=l2.stream().map(a->a+10).toList();//add 10 to each element
        System.out.println(g);
        List<Integer>h=l1.stream().map(a->a.length()).toList();//length of string
        System.out.println(h);
        List<Character>i=l1.stream().map(a->a.charAt(0)).toList();//first character from each string
        System.out.println(i);
        List<Integer>l3=List.of(-3,-5,-6-5,7);
        List<Integer>j=l3.stream().map(a->a<0?0:a).toList();//convert negative number to 0
        System.out.println(j);
        List<Integer>k=l2.stream().map(a->a*a).toList();//square of a number
        System.out.println(k);
        List<Integer>l=l2.stream().map(a->a*2).toList();//element is doubled
        System.out.println(l);
        List<Integer>m=l2.stream().filter(a->a>20).map(a->a*3).toList();//greater than 20 and multiply by 3
        System.out.println(m);
        List<String>n=l1.stream().filter(a->a.length()>4).map(a->a.toUpperCase()).toList();//length greater than 4 and convert to uppercase
        System.out.println(n);
        //filter employees whose salary is greater than 60000 and return their names in uppercase using map
        List<Employee>emp=Arrays.asList(
       		 new Employee(1,20000,"abc"),
       		 new Employee(2,60000,"svg"),
       		 new Employee(3,65000,"alice")
       		 );
        List<String>names1=emp.stream().filter(x->x.salary>60000).map(s1->s1.name.toUpperCase()).toList();
        System.out.println(names1);
        
        
        
        
        
	}

}
