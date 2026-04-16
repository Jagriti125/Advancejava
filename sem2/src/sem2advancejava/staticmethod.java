//static method
package sem2advancejava;
interface inter3{
	static int add(int x,int y) {
	return x+y;
}
}
public class staticmethod implements inter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(inter3.add(4, 5));
	}

}
