import java.io.FileWriter;
import java.io.IOException;

public class Instance {


	public static void main(String[] args) throws IOException {
		FileWriter f1 = new FileWriter("Data.txt");  //new�� �����ϸ� �޸� �Ҵ� (������ �����ڿ����Ͽ� �ʱ�ȭ�Ǹ� f1������ ����)
		
		f1.write("hi");
		f1.close();
		
		
	}

}
