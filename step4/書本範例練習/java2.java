import java.io.*;

public class java2{
	public static void main(String[] args)throws IOException{
		System.out.println("�n�إߪ��s�ɮצW�١]���|�^");
		System.out.print("��");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String filename = br.readLine();
		
		FileWriter fw= new FileWriter(filename);
	
		System.out.println("�п�J�r�� : ");
		String str = br.readLine();
		fw.write(str,0,str.length());
		fw.write('\n');

		System.out.println("�п�J��� : ");
		str = br.readLine();
		fw.write(str,0,str.length());
		fw.write('\n');

		System.out.println("�п�J�B�I�� : ");
		str = br.readLine();
		fw.write(str,0,str.length());

		fw.flush();
		fw.close();

	}
}