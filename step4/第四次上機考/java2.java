import java.io.*;

public class java2{
	public static void main(String[] args)throws IOException{
		
		FileReader fr = new FileReader("in1.txt");
		char[] cbuf = new char[99];
		int ch; //目前讀到的
		
		int isRead_1 = fr.read(cbuf,0,cbuf.length);

		
		fr = new FileReader("in2.txt");
		int isRead_2=isRead_1; //第二次讀取
		while((ch=fr.read()) != -1){
			cbuf[isRead_2]=(char)ch;
			isRead_2++;
		}
		
		//for(int i=0 ; i<isRead_2 ; i++){
			System.out.println(cbuf);
		//}
		
		
		FileWriter fw = new FileWriter("out.txt");
		
		fw.write("$$$",0,3);
		fw.write(cbuf,0,isRead_1);
		fw.write("###",0,3);

		fw.write(13);
		fw.write(10);
		fw.write(13);
		fw.write(10);

		fw.write("$$$",0,3);
		fw.write(cbuf,isRead_1,isRead_2-isRead_1);
		fw.write("###",0,3);

		fw.close();
	}
}