class p1{

	public static void main(String[] args){

		int num=2569185;
		
		System.out.print("Digits divisible by 2 are :");
		
		while(num>0){
			
			int rem=num%10;
			
			num=num/10;
			
			if(rem%2==0){
				System.out.print(rem+" ");
		
		
			}	
		}
	
	}

}
