class num {
        public static void main(String[] args){
                int num =234;
		int product=1;
                while(num>0){
                        int rem=num%10;
                        product=product*rem;
                        
                        num=num/10;
		}
			System.out.println(product);
                
        }
}

