
class Print{
public static String delimeter ;

public Print (String delimeter)
{
	this.delimeter = delimeter;   //this �� ���� ������ �ν���Ʈ�� ���� �̸��� ����Ŵ
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