import java.io.*;

public class java4{
	public static void main(String[] args)throws IOException{
		
		System.out.println("請輸入存放機率資料的檔案名稱");
		System.out.print("→");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String filename = br.readLine();

		DataInputStream din =
			new DataInputStream(
				new BufferedInputStream(
					new FileInputStream(filename)));

		double hopeless;

		try{
			while(true){
				System.out.print(din.readInt() + "取 6 共有 "+
						(hopeless = din.readDouble())+
						" 種排列組合,");
				System.out.println(" 猜中機率為 " + 1/hopeless);
				din.skipBytes(12);
			}
		}
		catch(EOFException e){
			din.close();
		}

	}
}