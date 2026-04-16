//local variable type inference
package sem2advancejava;
class Test2{
	//inside a contructor
	Test2(){
		var x=23;
		System.out.println("constructor value"+x);
		
	}
	//inside a method
	void check() {
		var s="hello";
		System.out.println(s);
	}
	//string check(){
	//var s="hello"
	//return s;
}
public class localvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Test2 t=new Test2();
          t.check();
          //inside a block such as if, loop,or they block 
          for(var i=0;i<=4;i++) {
        	  System.out.println(i);
          }
          
	}

}
