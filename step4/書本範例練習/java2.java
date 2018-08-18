import java.io.*;

public class java2{
	public static void main(String[] args)throws IOException{
		System.out.println("要建立的新檔案名稱（路徑）");
		System.out.print("→");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String filename = br.readLine();
		
		FileWriter fw= new FileWriter(filename);
	
		System.out.println("請輸入字串 : ");
		String str = br.readLine();
		fw.write(str,0,str.length());
		fw.write('\n');

		System.out.println("請輸入整數 : ");
		str = br.readLine();
		fw.write(str,0,str.length());
		fw.write('\n');

		System.out.println("請輸入浮點數 : ");
		str = br.readLine();
		fw.write(str,0,str.length());

		fw.flush();
		fw.close();

	}
}