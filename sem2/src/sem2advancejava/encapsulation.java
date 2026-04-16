package sem2advancejava;

/*class Student{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public Student(int id,String name) {
		super();
		this.getName();
		this.getId();
		
	}

	
}*/

 record Student23(int id, String name ) {
	public void show() {
		System.out.println("inside code");
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student23 s1=new Student23(1,"ram");
      System.out.println(s1.id()+s1.name());
      s1.show();
      Student23 s2=new Student23(2,"xyz");
      System.out.println(s2);
	}

}
