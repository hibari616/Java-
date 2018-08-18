import java.io.*;

public class java1{
	public static void main(String[] args) throws IOException{
		/* 使用者將輸入一組以<開頭、以/>結尾、的不定長度字串，例如：
		 * <item android:id="@+id/java"/>[Enter]
		 * 請輸出TWitem android:id="@+id/java"
		 */

		byte[] b = new byte[999];
		int i = System.in.read(b,2,b.length-2);
		System.out.print("byte[] b 長度"+i);
		System.out.println();
		b[0]='T';
		b[1]='W';

		System.out.write(b,0,i+2);

		

	}
}