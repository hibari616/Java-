import java.io.*;

public class java1{
	public static void main(String[] args) throws IOException{
		
		//==========1

		byte[] b = new byte[99];
		int i = System.in.read(b); //�}�C�`�@
		int readTotal=0; //�p��{�bŪ�쪺�`�@
		
		System.out.println("����Ū���F"+i+"�� byte");
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
		
		System.out.println("����Ū���F"+nowRead+"�� byte");
		for(int y=0;y<i;y++){
			System.out.print(b[y]+" ");
		}
		
		System.out.println();

		//==========3

		nowRead = System.in.read(b,i,nowRead);
		System.out.println("�̫�b�`�@�s�J�F"+(i+=nowRead)+"��byte");
		System.out.write(b,0,i);

	}
}