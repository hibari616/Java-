import java.io.*;

public class java1{
	public static void main(String[] args)throws IOException{
		System.out.println("�nŪ�����ɮצW�١]���|�^");
		System.out.print("��");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		FileReader fr = new FileReader(str);
	
		System.out.println("\n�H�U�O��r�� "+ str +" �����e :");
		int ch;

		while((ch=fr.read()) != -1){
			System.out.print((char)ch);
		}
		
		fr.close();
	}
}