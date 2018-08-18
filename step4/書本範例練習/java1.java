import java.io.*;

public class java1{
	public static void main(String[] args)throws IOException{
		System.out.println("要讀取的檔案名稱（路徑）");
		System.out.print("→");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		FileReader fr = new FileReader(str);
	
		System.out.println("\n以下是文字檔 "+ str +" 的內容 :");
		int ch;

		while((ch=fr.read()) != -1){
			System.out.print((char)ch);
		}
		
		fr.close();
	}
}