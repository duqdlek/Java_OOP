class Foo{
public static String p2 = "hi";  //����ƽ ����
public String p3 = "Hello";       //�ν��Ͻ� ����


static void classMethod() { //Ŭ���� �޼ҵ�
	System.out.println("Method");
}

public void instanceMethod() {     //�ν��Ͻ� �޼ҵ�
	System.out.println("instance");
}
}
public class LabForInstance {

	public static void main(String[] args) {

    System.out.println(Foo.p2);  //Foo Ŭ������ ���� ȣ�� ����
//    System.out.println(Foo.p3); // Foo Ŭ������ �ν��Ͻ� ���� ȣ�� ����  
 
  
      Foo.classMethod(); // Foo Ŭ������ static �޼ҵ� ȣ�� ����
//      Foo.instanceMethod(); //Foo Ŭ������ �ν��Ͻ� �޼ҵ� ȣ�� ����
       
    Foo c1 = new Foo();     
    
             
    System.out.println(c1.p3); //Foo Ŭ������ �ν��Ͻ� ���� ȣ�� ����
//    System.out.println(c1.a);
    c1.instanceMethod();     //Foo Ŭ������ �ν��Ͻ� �޼ҵ� ȣ�� ����      
       
           
	}

}
