public class java2{
	public static void main(String[] args){
		
		int start=0,end=0;
		byte[] b = {60,58,49,50,51,47,62,58,58,47,97,98,99,62};
		
		for(int i=0 ; i<b.length ; i++){
			if(b[i]==':' && b[i+1]==':'){
				end=i;
			}
			//System.out.print((char)b[i]); //debug
		}
		//System.out.println(); //debug

		System.err.write(b,0,end);
		System.err.println();

				for(int i=0 ; i<b.length ; i++){
			if(b[i]=='/' && b[i+1]=='>'){
				start=i+2;
			}
		}

		System.err.write(b,start,b.length-start);
		System.err.println();

		//System.err.println();
		//System.out.println();
	}
}