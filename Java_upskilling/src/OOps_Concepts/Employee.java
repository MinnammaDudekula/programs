
package OOps_Concepts;

 class Employee1{

	float salary = 40000;

	
}

class Programmer1 extends Employee1{
	int bonus = 10000;
}

class Employee {

	public static void main(String args[]) {
		Programmer1 p = new Programmer1();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	}
}
