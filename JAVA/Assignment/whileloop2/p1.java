class num {
	public static void main(String[] args){
		int num =2567185;
		System.out.print("digits divisible by 2 are : ");
		while(num>0){
			int rem=num%10;
			if(rem%2==0){
				System.out.print(rem + " ");
			}
			num=num/10;
		}
		System.out.println();
	}
}
