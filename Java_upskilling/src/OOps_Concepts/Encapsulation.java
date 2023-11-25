package OOps_Concepts;

 class Encapsulation1{
	private int age;
	
	
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	

}

public class Encapsulation{
	public static void main(String[] args) {
		Encapsulation1 ob=new Encapsulation1();
		System.out.println(ob.getAge());
		ob.setAge(19);
		System.out.println(ob.getAge());
	}
}
