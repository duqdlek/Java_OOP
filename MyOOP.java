public class MyOOP {
class Print{

public static String delimeter = "";
public static void A() {         
	System.out.println(delimeter);
	System.out.println("A");
	System.out.println("A");
}

public static void B() {          
	System.out.println(delimeter);
	System.out.println("B");
	System.out.println("B");
}

}
	public static void main(String[] args) {
		Print.delimeter = "----";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
				
		Print.delimeter = "****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
	}
	

}
