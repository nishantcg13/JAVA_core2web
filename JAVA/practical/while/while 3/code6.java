class p6{
	public static void main(String[] args){

		int num=234;

		int m=1;

		System.out.print("Product of digits of numbers :");

		while(num>0){
	
			int rem=num%10;
	
			num=num/10;
	
			m=m*rem;
		}
	
		System.out.print(m+" ");
		
		
		
	
	
	}

}
