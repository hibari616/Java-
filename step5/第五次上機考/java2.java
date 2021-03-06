import java.io.*;

public class java2{
	public static void main(String[] args)throws IOException,ClassNotFoundException{
		
		/* 將每個讀取到的棋子物件分別輸出棋種和座標如下：
		 * 兵�Y(##,##)
		 * 將�Y(##,##)
		 */	

		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("abc"));

		char[][] chessColor = {{'帥','仕','相','?','傌','砲','兵'},
					{'將','士','象','車','馬','包','卒'}};
		
		try{
			while(true){
				chess c1 = (chess)ois.readObject();
				System.out.printf("%c�Y(%2d,%2d)\n",chessColor[c1.color][c1.type],c1.x,c1.y);
			}
		}
		catch(EOFException e){
			ois.close();
		}
		
	}
}