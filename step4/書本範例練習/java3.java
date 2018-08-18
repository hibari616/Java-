import java.io.*;

public class java3{
	public static void main(String[] args)throws IOException{
		
		System.out.println("要建立的二元檔檔名");
		System.out.print("→");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String filename = br.readLine();

		DataOutputStream dout =
			new DataOutputStream(
				new BufferedOutputStream(
					new FileOutputStream(filename)));

		for(int i=49;i>=38;i--){
			double hopeless = i;

			for(int j=1 ;j<6;j++){
				hopeless = hopeless *(i-j);
			}
			hopeless = hopeless / 720;
			
			dout.writeInt(i);
			dout.writeDouble(hopeless);
		}

		System.out.println("共寫入 "+ dout.size() + "個位元組！");
		dout.flush();
		dout.close();

	}
}