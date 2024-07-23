class p9{
	public static void main(String[] args){
	int num=2469185;
	int m=0;
	System.out.print("product of odd digits of given numbers is :");
	while(num>0){
		int rem=num%10;
		num=num/10;
		if(rem%2==1){
		int a=rem*rem;
		m=m+a;}}
		System.out.print(m+" ");
		
		
		
	
	}

}
