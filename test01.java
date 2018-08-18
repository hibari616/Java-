public class test01{
    
    public static void main(String[] args) {
	int[] a = {72,101,108,108,111,40,69,114,114,111,114,41,74,97,118,97};
	int star=0,end=0,end1=0;
	for(int i=0;i<a.length;i++){
		if(a[i]=='('){
			star=i;
			//i+=1;
			end=1;
		}
		else if(a[i]==')'){
			end1=1;
			//i+=1;
			end=0;
			System.out.println();
		}
		else if(end==1){
			System.err.write(a[i]);
		}
		else if(end1==1){
			System.out.write(a[i]);
		}
		else{
			System.out.write(a[i]);
		} 
	}
	System.out.println();
	System.err.println();
}}