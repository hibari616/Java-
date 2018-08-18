import java.io.*;

public class java1{
	public static void main(String[] args) throws IOException{


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		DataOutputStream fw = 
			new DataOutputStream(
				new BufferedOutputStream(
					new FileOutputStream("io.bin")));		

		for(int i=0;i<n;i++){
			double R = Math.random();
			int K = (int)(R*100)+1;
			
			fw.writeDouble(R);
			fw.writeUTF(" -> ");
			fw.writeInt(K);
			fw.writeUTF(" (");
			fw.writeBoolean(K%2==1);
			fw.writeUTF(")");
		}

		fw.flush();
		fw.close();

		DataInputStream fr =
			new DataInputStream(
				new BufferedInputStream(
					new FileInputStream("io.bin")));

		try{
			while(true){
				System.out.println(
					fr.readDouble()+
					fr.readUTF()+
					fr.readInt()+
					fr.readUTF()+
					fr.readBoolean()+
					fr.readUTF());
			}
		}
		catch(EOFException e){
			fw.close();
		}
	}
}