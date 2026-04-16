//default method
package sem2advancejava;

interface inter1{
	//void show();
	default void def() {
		System.out.println("default method inside interface");
		}
}
interface inter2{
	//void show();
	default void def() {
		System.out.println("default method inside interface");
	}
}
public class defaultmethod implements inter1,inter2 {
	public void def() {
		inter1.super.def();
		inter2.super.def();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      defaultmethod d=new defaultmethod();
      d.def();
	}

}
