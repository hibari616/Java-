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
		/*	�H�ѴѽL�O�@��10��9 ����u�ϡA���W���O�y��(1,1)�B�k�U���O�y��(10,9)
			�Ѥl���C��0 ��ܬ���B1 ��ܶ¦�
			�Ʀr 0~6 ���O��ܴѺءG�N�]�ӡ^�B�h�]�K�^�B�H�]�ۡ^�B���]?�^�B���]�X�^�B�]�]���^�B��]�L�^
			���@�H�Ѵݧ��p��
		 */
		chess[] c = new chess[13];
		c[0]=new chess(0,6,1,5); //1,5�]�L�^
		c[1]=new chess(1,0,1,6); //1.6�]�N�^
		c[2]=new chess(0,6,2,4); //2,4�]�L�^
		c[3]=new chess(0,6,3,4); //3,4�]�L�^
		c[4]=new chess(0,6,3,5); //3,5�]�L�^
		c[5]=new chess(1,3,3,6); //3,6�]���^
		c[6]=new chess(0,5,7,8); //7,8�]���^
		c[7]=new chess(1,6,8,5); //8,5�]��^
		c[8]=new chess(0,5,8,8); //8,8�]���^
		c[9]=new chess(1,6,9,4); //9,4�]��^	
		c[10]=new chess(1,6,9,6); //9,6�]��^
		c[11]=new chess(0,0,10,5); //10,5�]�ӡ^	
		c[12]=new chess(0,3,10,8); //10,8�]?�^		
		
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