class Foon{

	public static void classMethod () {
		System.out.println("Hi");
	}
	public void instanceMethod () {
		System.out.println("Hello");
	}
    public String instanceVars = "b";
    public static String instanceVarse;
	public static String ClassVar = "i class Var";
	public String instanceVar = "i instance Var";
}
public class LabForStatic {

	public static void main(String[] args) {
	    System.out.println(Foon.ClassVar);
	    //System.out.println(Foon.instanceVar); 
       Foon.classMethod();
       //Foon.instanceMethod();
       
      System.out.println(Foon.instanceVarse);
       Foon f1 = new Foon();
       System.out.println(f1.instanceVar);
       f1.instanceMethod ();
      //  f1.instanceVars = "hello";
       System.out.println(f1.instanceVars); 
     
	}

}
