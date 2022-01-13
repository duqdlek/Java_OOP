import java.io.FileWriter;
import java.io.IOException;

public class Instance {


	public static void main(String[] args) throws IOException {
		FileWriter f1 = new FileWriter("Data.txt");  //new를 생성하며 메모리 할당 (생략된 생성자에의하여 초기화되며 f1변수에 저장)
		
		f1.write("hi");
		f1.close();
		
		
	}

}
