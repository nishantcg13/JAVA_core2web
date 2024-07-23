class p3{

	public static void main(String[] args){
	
		int num=436780521;

		System.out.print("Digits divisible by 2 and 3 are :");

			while(num>0){
	
				int rem=num%10;
	
				num=num/10;
	
				if(rem%2==0 || rem%3==0){
	
					System.out.print(rem+" ");
		
		
		}
	}
	
	}

}
