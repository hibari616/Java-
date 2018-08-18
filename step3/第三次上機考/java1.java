import java.io.*;

public class java1{
	public static void main(String[] args) throws IOException{
		
		//==========1

		byte[] b = new byte[99];
		int i = System.in.read(b); //陣列總共
		int readTotal=0; //計算現在讀到的總共
		
		System.out.println("此次讀取了"+i+"個 byte");
		for(int y=0;y<i;y++){
			System.out.print(b[y]+" ");
		}
		
		System.out.println();

		//==========2

		int nowRead=0; 
		while(readTotal!=10){
			readTotal=System.in.read();
			b[i++]=(byte)readTotal;
			nowRead++;
		}
		
		System.out.println("此次讀取了"+nowRead+"個 byte");
		for(int y=0;y<i;y++){
			System.out.print(b[y]+" ");
		}
		
		System.out.println();

		//==========3

		nowRead = System.in.read(b,i,nowRead);
		System.out.println("最後b總共存入了"+(i+=nowRead)+"個byte");
		System.out.write(b,0,i);

	}
}