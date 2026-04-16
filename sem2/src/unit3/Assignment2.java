package unit3;
import java.util.*;

class Student1 {
    int mark;
    String name;

    Student1(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " (" + mark + ")";
    }
}

public class Assignment2 {

    public static void main(String[] args) {

        List<Student1> stud = Arrays.asList(
                new Student1(75,"anil"),
                new Student1(78,"abc"),
                new Student1(56,"riya"),
                new Student1(45,"aman"),
                new Student1(75,"nikhil")
        );

        List<Student1> pass = stud.stream()
                .filter(a -> a.mark > 60)
                .toList();
        System.out.println("Pass: " + pass);

        List<Student1> fail = stud.stream()
                .filter(a -> a.mark <= 60)
                .toList();
        System.out.println("Fail: " + fail);

        List<Integer> list = Arrays.asList(10, 60, 45, 80, 30);
        long count = list.stream()
                .filter(n -> n > 50)
                .count();
        System.out.println("Count: " + count);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        list1.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
        int l2 = list2.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> 2 * x)
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + l2);

        List<String> names = List.of("Aarav","Barkha","Priyanshi","Sujal","Nipun","Ria","Ayaan");
        names.stream()
                .filter(s -> s.startsWith("A"))
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}