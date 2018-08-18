import java.io.*;

public class java1{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		DataOutputStream dopt = new DataOutputStream(
						new BufferedOutputStream(
							new FileOutputStream("io.bin")));

		for(int i=1 ; i<=n ; i++){

			double R = Math.random();
			long L = Math.round(R);

			dopt.writeDouble(R);
			dopt.writeUTF(" -> ");
			dopt.writeLong(L);
			dopt.writeUTF(" (");
			dopt.writeBoolean(L==1);
			dopt.writeUTF(")");
		}

		dopt.flush();
		dopt.close();

		DataInputStream din = new DataInputStream(
						new BufferedInputStream(
							new FileInputStream("io.bin")));

		try{
			while(true){
				System.out.println(
				din.readDouble()+
				din.readUTF()+
				din.readLong()+
				din.readUTF()+
				din.readBoolean()+
				din.readUTF());
			}
		}
		catch(EOFException e){
			din.close();
		}
		
	}
}