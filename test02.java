public class test02{
    
    public static void main(String[] args) {
	byte[] b = {72,101,108,108,111,40,69,114,114,111,114,41,74,97,118,97};
	int star=0,end=0,end1=0,star1=0;
	for(int i=0;i<b.length;i++){
		if(b[i]=='('){
			star=i;
			end=1;
			
		}
		else if(b[i]==')'){
			end1=1;
			end=0;
			star1=i;
			System.out.println();
		}
		else if(end==1){
		}
		else if(end1==1){
		}
		else{
		} 
	}
	System.out.write(b,0,star);
	System.out.println();
	System.err.write(b,star+1,star1-star-1);
	System.err.println();
	System.out.write(b,++star1,b.length-star1);
	System.out.println();
	
	
    }
}