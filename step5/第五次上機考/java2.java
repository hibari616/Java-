import java.io.*;

public class java2{
	public static void main(String[] args)throws IOException,ClassNotFoundException{
		
		/* ±N¨C­ÓÅª¨ú¨ìªº´Ñ¤lª«¥ó¤À§O¿é¥X´ÑºØ©M®y¼Ð¦p¤U¡G
		 * §L„Y(##,##)
		 * ±N„Y(##,##)
		 */	

		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("abc"));

		char[][] chessColor = {{'«Ó','¥K','¬Û','?','ØX','¯¥','§L'},
					{'±N','¤h','¶H','¨®','°¨','¥]','¨ò'}};
		
		try{
			while(true){
				chess c1 = (chess)ois.readObject();
				System.out.printf("%c„Y(%2d,%2d)\n",chessColor[c1.color][c1.type],c1.x,c1.y);
			}
		}
		catch(EOFException e){
			ois.close();
		}
		
	}
}