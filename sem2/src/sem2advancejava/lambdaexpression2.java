
//lambda expression with one parameter
package sem2advancejava;

@FunctionalInterface
interface NoParameter {
 int display(int x);
}

public class lambdaexpression2 {
 public static void main(String[] args) {

     // with one parameter
     NoParameter n = (a) -> a * a;
    // NoParameter n=a->a*a;// only in single parameter

     System.out.println("square = " + n.display(4));
 }
}
