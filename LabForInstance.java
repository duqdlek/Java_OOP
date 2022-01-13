class Foo{
public static String p2 = "hi";  //스태틱 변수
public String p3 = "Hello";       //인스턴스 변수


static void classMethod() { //클래스 메소드
	System.out.println("Method");
}

public void instanceMethod() {     //인스턴스 메소드
	System.out.println("instance");
}
}
public class LabForInstance {

	public static void main(String[] args) {

    System.out.println(Foo.p2);  //Foo 클래스의 변수 호출 가능
//    System.out.println(Foo.p3); // Foo 클래스의 인스턴스 변수 호출 실패  
 
  
      Foo.classMethod(); // Foo 클래스의 static 메소드 호출 가능
//      Foo.instanceMethod(); //Foo 클래스의 인스턴스 메소드 호출 실패
       
    Foo c1 = new Foo();     
    
             
    System.out.println(c1.p3); //Foo 클래스의 인스턴스 변수 호출 성공
//    System.out.println(c1.a);
    c1.instanceMethod();     //Foo 클래스의 인스턴스 메소드 호출 성공      
       
           
	}

}
