
class Print{
public static String delimeter ;

public Print (String delimeter)
{
	this.delimeter = delimeter;   //this 는 내가 생성한 인스턴트의 변수 이름을 가리킴
}
public void A() {         
	System.out.println(this.delimeter);
	System.out.println("A");
	System.out.println("A");
}

public void B() {          
	System.out.println(this.delimeter);
	System.out.println("B");
	System.out.println("B");
}
}