class num {
        public static void main(String[] args){
                int num=9367924;
                int sum=0;
		int product=1;
                while(num>0){
                        int rem=num%10;
                        if(rem%2==0){
                                product=product*rem;
			}
			else{
                                sum=sum+rem;
                        }
                        num=num/10;
                }
                System.out.println("sum of odd digit is: "+sum);
		System.out.println("product of even digit is: "+product);
        }
}

