package Java8;
@FunctionalInterface
interface Drawable1{
//	void draw();
	Method_Reference mydraw();
}
public class Method_Reference {
	Method_Reference(){
		System.out.println("Constructor method reference");
	}
	
	//Method reference to static methods
	
	static int width=12;
	public static void Mydraw() {
		System.out.println("existing static draw method but we are refering  " + width);
	}
	
	
	// method reference to intsance methods
	
	public void mynewdraw() {
		System.out.println("existing instace  draw method but we are refering ");
	}
	public static void main(String[] args) {
		
	
		
//		Drawable1 d=Method_Reference::Mydraw;
//		Method_Reference ob=new Method_Reference();
//		Drawable1 d1=ob::mynewdraw;
//		d.draw();
//		d1.draw();
		
		
		//constructor method reference
		Drawable1 d2=Method_Reference::new;
		d2.mydraw();

	}

}
