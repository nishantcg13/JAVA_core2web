class p2{
	
	public static void main(String[] args){
		
		int num=2569185;
		
		System.out.print("Digits not divisible by 3 are :");
	
		while(num>0){
				int rem=num%10;
		
				num=num/10;		
			
					if(rem%3==0){
					
						continue;
								}
					else{
		
						System.out.print(rem+" ");
		
		
						}
					}
	
	}

}
