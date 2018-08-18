import java.io.*;

public class java2{
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("in1.txt");
		char[] cbuf = new char[1000];
		int isRead=0;
		int ch;

		while((ch=fr.read()) != -1){
			cbuf[isRead]=(char)ch;
			isRead++;
		}
		fr.close();

		fr = new FileReader("in2.txt");
		int i = fr.read(cbuf,isRead,cbuf.length-isRead);

		for(int y=0;y<isRead+i;y++){
			System.out.print(cbuf[y]);
		}
	
		fr.close();

		FileWriter fw = new FileWriter("out.txt");
		fw.write("$$$",0,3);
		fw.write(cbuf,0,isRead);
		fw.write("###",0,3);
		fw.write('\r');
		fw.write('\n');	

		fw.write("$$$",0,3);
		fw.write(cbuf,isRead,i);
		fw.write("###",0,3);
		fw.write('\r');
		fw.write('\n');	

		fw.close();
	}
}