import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] arg ) throws IOException {
        
		
		//Ŭ���� : Class Math FileWriter
		//�ν��Ͻ� : f1,f2
		//���� : PI
		//�޼ҵ� : Floor, ceil
		System.out.println(Math.PI); //Math��� Class �� PI ��� ����
		System.out.println(Math.floor(1.8)); //���� floor�� �޼ҵ�
		System.out.println(Math.ceil(1.8)); //�ø� ceil�� �޼ҵ��
		
		FileWriter f1 = new FileWriter("data.txt"); //f1�� ����
		f1.write("Hello");
        f1.write("Java");
        f1.close();
        
        FileWriter f2 = new FileWriter("data2.txt"); //f1�� ����
		f2.write("Hello");
        f2.write("Java");
        f2.close();
       
        
	}

	

}
