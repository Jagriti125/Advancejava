package unit1;

interface i11{
	public void calculate(int x);
	
}
class Square implements i11{
	public void calculate(int p) {
		int area=p*p;
		System.out.println("area="+area);
	}
}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Square s=new Square();
         s.calculate(5);
	}

}
