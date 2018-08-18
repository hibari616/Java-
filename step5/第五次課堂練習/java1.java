import java.io.*;

class card implements Serializable{
	double ran;
	int num;

	public card(double r,int n){
		ran=r;
		num=n;
	}
}

public class java1{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		//write object

		ObjectOutputStream oos = 
			new ObjectOutputStream(
				new FileOutputStream("card"));
		
		for(int i=8 ; i<=12 ;){
			double r = Math.random();
			int n = (int)(r*5)+8;
			if( n != i) continue; //沒有照順序 Continue	

			card c = new card(r,n);
			oos.writeObject(c);
			i++; //有照順序再+1
		}
		
		oos.flush();
		oos.close();

		//read object

		ObjectInputStream ois = 
			new ObjectInputStream(
				new FileInputStream("card"));
		
		try{
			while(true){
				card d = (card)ois.readObject();
				//System.out.println(d.ran + "  "+d.num);
				System.out.printf("num=%2d  ran=%7.5f\n",d.num,d.ran);
			}
		}
		catch(EOFException e){
			ois.close();
		}



	}
}