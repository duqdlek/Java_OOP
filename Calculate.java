class Study3{

   public double valueOfSupply;

   public static double vatRate = 0.1;
   public Study3 (double ValueOfSupply) {
	   this.valueOfSupply = ValueOfSupply;
   }
   public double getVAT() {
       	return valueOfSupply * vatRate;
    }
    
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}

public class Calculate{

   public static void main(String[] args) {
   
   Study3 a1 = new Study3 (10000.0);
   Study3 a2 = new Study3 (20000.0);
   
   System.out.println("Value of supply : " + a1.valueOfSupply);
   System.out.println("Value of supply : " + a2.valueOfSupply);
 
   System.out.println("VAT : "+ a1.getVAT());
   System.out.println("VAT : "+ a2.getVAT());
   
   System.out.println("Total : "+a1.getTotal());
   System.out.println("Total : "+ a2.getTotal());
    }
}