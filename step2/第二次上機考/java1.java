public class java1{
	public static void main(String[] args){
		int[] a = {83,49,84,57,85,58,48,106,97,53,118,97,56,52};
		for(int i=0 ; i<a.length ; i++){
			if(a[i]>='0' && a[i]<='9'){
				System.out.write(a[i]);
			}
			else{
				System.err.write(a[i]);
			}
		}
		System.err.println();
		System.out.println();
	}
}