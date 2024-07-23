class p7{

	public static void main(String[] args){

		int num=256985;

		int s=0;


		System.out.print("Sum of even digits is :");

		while(num>0){
	
			int rem=num%10;
	
			num=num/10;
	
			if(rem%2==0){
	
				s+=rem;
	
			}}
	
		System.out.print(s+" ");
		
		
		
	
	
	}

}
