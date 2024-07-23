class num {
        public static void main(String[] args){
                int num =2469185;
		int sum=0;
                while(num>0){
                        int rem=num%10;
                        if(rem%2==1){
                                int product=rem*rem;
				sum=sum+product;
                        }
                        num=num/10;
                }
                System.out.println(sum);
        }
}

