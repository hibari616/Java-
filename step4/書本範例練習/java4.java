import java.io.*;

public class java4{
	public static void main(String[] args)throws IOException{
		
		System.out.println("�п�J�s����v��ƪ��ɮצW��");
		System.out.print("��");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String filename = br.readLine();

		DataInputStream din =
			new DataInputStream(
				new BufferedInputStream(
					new FileInputStream(filename)));

		double hopeless;

		try{
			while(true){
				System.out.print(din.readInt() + "�� 6 �@�� "+
						(hopeless = din.readDouble())+
						" �رƦC�զX,");
				System.out.println(" �q�����v�� " + 1/hopeless);
				din.skipBytes(12);
			}
		}
		catch(EOFException e){
			din.close();
		}

	}
}