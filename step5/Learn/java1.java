import java.io.*;

class card implements Serializable{
	double ran;
	int num;
	
	public card (double r, int n){
		ran=r;
		num=n;
	}
}

public class java1{
	public static void main(String[] args)throws IOException,ClassNotFoundException{
		
		BufferedReader br = new BufferedReader(
								new InputStreamReader(System.in));
		
		ObjectOutputStream oos = new ObjectOutputStream(
									new FileOutputStream("card.Object"));
		
		
		System.out.print("Please Enter Object Number : ");
		int n = Integer.parseInt(br.readLine());
		
		card[] c = new card[n]; //物件陣列n個
		for (int j=0 ; j<c.length ; ){
			double r = Math.random();
			int i = (int)(r*c.length)+8;
			if(i == 8+j){
				c[j] = new card(r,i); //每跑一物件就就建立物件
				oos.writeObject(c[j]); //每建立一個物件寫入
				j++;
			}
		}
		
		oos.flush();
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(
									new FileInputStream("card.Object"));
									
		try{
			while(true){
				card cr = (card)ois.readObject();
				System.out.printf("num=%02d  ran=%7.5f\n",cr.num,cr.ran);
			}
		}
		catch(EOFException e){
			ois.close();
		}

	}
}