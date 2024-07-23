class p10{
	public static void main(String[] args){
	int num=9367924;
	int m=1;
	int s=0;
	while(num>0){
		int rem=num%10;
		num=num/10;
		if(rem%2==0){
		m*=rem;
		}
		else{
		s+=rem;
		}}
		System.out.print("Sum of odd digits is"+s);
		System.out.print(" && multi of even digits is"+m);
		
		
	
	}

}
