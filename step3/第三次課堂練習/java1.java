import java.io.*;

public class java1{
	public static void main(String[] args) throws IOException{
		/* �ϥΪ̱N��J�@�եH<�}�Y�B�H/>�����B�����w���צr��A�Ҧp�G
		 * <item android:id="@+id/java"/>[Enter]
		 * �п�XTWitem android:id="@+id/java"
		 */

		byte[] b = new byte[999];
		int i = System.in.read(b,2,b.length-2);
		System.out.print("byte[] b ����"+i);
		System.out.println();
		b[0]='T';
		b[1]='W';

		System.out.write(b,0,i+2);

		

	}
}