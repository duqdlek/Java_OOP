class Accounting{
	 public static double valueOfSupply;
	    public static double vatRate = 0.1;
	    
	    public static double getVAT() {   
	    	return valueOfSupply * vatRate;
	    }    
	    public static double getTotal() {      
	    	return valueOfSupply + getVAT();
	    }
}
public class Study2 {
    
   
 
    public static void main(String[] args) {
    	valueOfSupply = 10000.0;
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("Total : " + getTotal());
 
    }
 
}