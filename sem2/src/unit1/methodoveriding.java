package unit1;
class Test2{
	public int sum(int x,int y) {
		System.out.println("parent class");
		return x+y;
	}
	public int sum(int x, int y, int z) {
		
		return x+y+z;
	}
	public long sum(int x,long y) {
		return x+y;		
	}
}
class Child extends Test2{
	public int sum(int x,int y) {
		System.out.println("child class");
		return x+y;
	}
}
public class methodoveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test2 t=new Test2();
       System.out.println(t.sum(2, 5));
       System.out.println(t.sum(3, 4,5));
       System.out.println(t.sum(8, 5));
      Child c=new Child();
       System.out.println(c.sum(2, 5));
       //upcasting(reference from parent class but child clas will run and give output , parent class is only for reference)
       Test2 c1=new Child();
       System.out.println(c1.sum(2, 5));
       
	}
	
	

}
