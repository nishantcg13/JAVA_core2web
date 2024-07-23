class p9{
	public static void main(String[] args)
	{

	int i=214367689;
	int even=0;
	int odd=0;
	while(i>0){
	int rem = i%10;
	i=i/10;
	if(rem%2==0)
	{even++;}
	else{
		odd++;
	}
		
	

	}
	System.out.print(even+" ");
	System.out.print(odd);
}
}
