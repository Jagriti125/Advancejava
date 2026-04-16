package unit1;

abstract class Shape11{
	abstract public void calculate(int x, int y);
	public void show() {
		
	}
}
class Rectangle extends Shape11{
	public void calculate(int l,int b) {
		int area=l*b;
		System.out.println("area="+area);
		}
}
public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Shape11 s=new Rectangle();
         s.calculate(3, 8);
	}

}
