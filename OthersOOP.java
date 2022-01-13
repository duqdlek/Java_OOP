import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] arg ) throws IOException {
        
		
		//클래스 : Class Math FileWriter
		//인스턴스 : f1,f2
		//변수 : PI
		//메소드 : Floor, ceil
		System.out.println(Math.PI); //Math라는 Class 의 PI 라는 변수
		System.out.println(Math.floor(1.8)); //내림 floor은 메소드
		System.out.println(Math.ceil(1.8)); //올림 ceil은 메소드야
		
		FileWriter f1 = new FileWriter("data.txt"); //f1은 변수
		f1.write("Hello");
        f1.write("Java");
        f1.close();
        
        FileWriter f2 = new FileWriter("data2.txt"); //f1은 변수
		f2.write("Hello");
        f2.write("Java");
        f2.close();
       
        
	}

	

}
