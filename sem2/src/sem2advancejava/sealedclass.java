package sem2advancejava;
sealed class Vehicle permits Car,Bike,Truck{
	public void start() {
		System.out.println("vehicle started");
	}
}
final class Car extends Vehicle{
	public void run() {
		System.out.println("car is running");
	}
}
non-sealed class Bike extends Vehicle{
	public void run() {
		System.out.println("bike is running");
	}
}
sealed class Truck extends Vehicle permits Scooter{
	public void run() {
		System.out.println("truck is running");
	}
}
final class Scooter extends Truck{
public class sealedclass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vehicle v=new Vehicle();
       v.start();
       
       Car c=new Car();
       c.run();
       Bike b=new Bike();
       b.run();
       Truck t=new Scooter();
       t.run();
	}

}}
