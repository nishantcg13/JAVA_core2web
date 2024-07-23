class num {
        public static void main(String[] args){
                int num =256985;
                while(num>0){
                        int rem=num%10;
                        if(rem%2==1){
                                System.out.print(rem*rem + " ");
                        }
                        num=num/10;
                }
		System.out.println();
        }
}

