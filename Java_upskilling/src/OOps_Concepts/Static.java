package OOps_Concepts;

public class Static {
	//Static Block
	
	
	 static{System.out.println("static block is invoked");}  
	
	
	
	int rollno; 
	   String name;  
	   static String college ="KVSW"; 
	   
	   //Static methods
	   
	   static void change(){  
		     college = "RGM";  
		     }  
	   
	   
	   
	   
	   public static void main(String[] args) {
		Static ob=new Static();
		
		System.out.println(ob.college);
		ob.change();
		System.out.println(ob.college);
	}

}
