class p8{
	public static void main(String[] args){
	int num=256985;
	int m=1;
	System.out.print("product of odd digits of given numbers is :");
	while(num>0){
		int rem=num%10;
		num=num/10;
		if(rem%2==1){
		m*=rem;}}
		System.out.print(m+" ");
		
		
		
	
	}

}
