import java.io.*;

public class java1{
	public static void main(String[] args) throws IOException{
		
		char[] cbuf = new char[1000];
		int isRead=0;

		FileReader fr = new FileReader("in1.txt");
		int a = fr.read(cbuf,3,cbuf.length-3);
		isRead+=a;
		
		fr = new FileReader("in2.txt");
		int b = fr.read(cbuf,3+isRead,isRead);
		isRead+=b;

		fr = new FileReader("in3.txt");
		int c = fr.read(cbuf,3+isRead,isRead);
		isRead+=c;

		FileWriter fw = new FileWriter("out.txt");
		int i = fw.write(cbuf,0,a);
		fw.write('¡A');
		fw.write(cbuf,0,a);
		fw.write('¡A');

	}
}