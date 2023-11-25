package OOps_Concepts;

public class Object {
	int age;  // instance variables created inside the class but outside the method ,
	         //doesn't get memory at compile time. It gets memory at runtime when an object or instance is created. 
	
	String name;
	public static void main(String[] args) {
		Object ob=new Object();
		
		System.out.println(ob.age);
		System.out.println(ob.name);
	}

}
