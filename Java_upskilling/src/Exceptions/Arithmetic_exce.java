package Exceptions;

public class Arithmetic_exce {
	public static void main(String[] args) {
		try {
			int i=100/0;
			
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("arithmetic exception");
		}
	}

}
