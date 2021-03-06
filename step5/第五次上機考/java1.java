import java.io.*;

class chess implements Serializable{
	int color;
	int type;
	int x, y;
	
	public chess(int color,int type,int x,int y){
		this.color=color;
		this.type=type;
		this.x=x;
		this.y=y;
	}
}

public class java1 {
	public static void main(String[] args)throws IOException,ClassNotFoundException {
		/*	象棋棋盤是一個10×9 的格線圖，左上角是座標(1,1)、右下角是座標(10,9)
			棋子的顏色0 表示紅色、1 表示黑色
			數字 0~6 分別表示棋種：將（帥）、士（仕）、象（相）、車（?）、馬（傌）、包（砲）、卒（兵）
			有一象棋殘局如圖
		 */
		chess[] c = new chess[13];
		c[0]=new chess(0,6,1,5); //1,5（兵）
		c[1]=new chess(1,0,1,6); //1.6（將）
		c[2]=new chess(0,6,2,4); //2,4（兵）
		c[3]=new chess(0,6,3,4); //3,4（兵）
		c[4]=new chess(0,6,3,5); //3,5（兵）
		c[5]=new chess(1,3,3,6); //3,6（車）
		c[6]=new chess(0,5,7,8); //7,8（砲）
		c[7]=new chess(1,6,8,5); //8,5（卒）
		c[8]=new chess(0,5,8,8); //8,8（砲）
		c[9]=new chess(1,6,9,4); //9,4（卒）	
		c[10]=new chess(1,6,9,6); //9,6（卒）
		c[11]=new chess(0,0,10,5); //10,5（帥）	
		c[12]=new chess(0,3,10,8); //10,8（?）		
		
		ObjectOutputStream oos = new ObjectOutputStream(
						new FileOutputStream("abc"));
		
		for(int i=0 ; i<c.length ; i++){
			oos.writeObject(c[i]);
		}
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("abc"));
		
		try{
			while(true){
				chess c1 = (chess)ois.readObject();
				System.out.printf("color=%2d�Y�Ytype=%2d�Y�Yx=%2d�Y�Yy=%2d�Y�Yx/y=%6.3f\n",c1.color,c1.type,c1.x,c1.y,(float)c1.x/(float)c1.y);
			}
		}
		catch(EOFException e){
			ois.close();
		}
		
	}
}