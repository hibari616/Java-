public class java1{
	public static void main(String[] args){
		
		int[]  a = {120,64,100,97,69,73,96,122,65,91,88,48,90,123,96};
		for (int i=0 ; i<a.length ; i++){
			if(a[i]>='a' && a[i]<='z'){
				System.out.write(a[i]);
			}
		}
		System.out.println();
		
		byte[]  b = {106,97,118,64,60,115,116,47,117,47,62,46,62,119};
		int str=0,end=0;
		for (int i=0 ; i<b.length ; i++){

			if(b[i]=='<'){
				str=i;
			}
			if(b[i]=='/' & b[i+1]=='>'){
				end=i;
				break;
			}
		}
		System.err.write(b,str+1,end-str);
		System.err.println();
	}
}