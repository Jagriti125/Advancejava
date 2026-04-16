package sem2advancejava;
@FunctionalInterface
interface MyInterface{
	String show(String msg);
}
interface int2{
	int cal(String s);
	
}
public class arbitaryobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //instance method reference of arbitary object
		MyInterface ref=String::toUpperCase;
        ref.show("java");
        
        int2 i2=String::length;
        System.out.println(i2.cal("java"));
        }

}
