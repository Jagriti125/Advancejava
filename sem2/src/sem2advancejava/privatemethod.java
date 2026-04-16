package sem2advancejava;
interface inter4{
	private void checkbalance() {
		System.out.println("checking balance");
	}
	default void deposit() {
		System.out.println("money deposited");
		checkbalance();
	}
}
public class privatemethod implements inter4{
public static void main(String[]arg) {
	privatemethod p=new privatemethod();
	p.deposit();
}
}
