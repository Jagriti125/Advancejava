package unit1;
class Vehicle{
	int speed=40;
	Vehicle(int s){
		System.out.println("parameterised constructor");
			}
		}
class Car extends Vehicle{
	
Car(int s) {
		super(s);
		System.out.println("car speed");
	}
void brand() {
	System.out.println("car brand");
}
}
class Shape{
	void shape1() {
	int sides=0;
	System.out.println("sides of a shape");
}
}
	class Triangle extends Shape{

		void display() {
		int sides=3;
		
		System.out.println(sides);
	
}
	}
public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c=new Car(40);
        Triangle t=new Triangle();
	}

}
