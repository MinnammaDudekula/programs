package Exceptions;

public class NumberFormat {
	public static void main(String[] args) {
		String s="asb";
		try {
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Number format exception");
		}
	}

}
