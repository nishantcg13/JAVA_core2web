class p5{
	public static void main(String[] args){

		int num=256985;

		System.out.print("Cubes of even digits are :");

		while(num>0){
	
			int rem=num%10;
	
			num=num/10;
	
			if(rem%2==0){
		
	
				System.out.print(rem*rem*rem+" ");
		
		
		}
	}
	
	}

}
