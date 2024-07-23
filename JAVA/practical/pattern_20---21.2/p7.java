class pattern {
        public static void main(String[] args){
                int ch=64;
                for(int i=1;i<=9;i++){
                        if(i%2==0){
                                System.out.print(i + " ");
                        }else{
				int c=ch+i;
                        	System.out.print((char)c +" ");
                        }
                }
                System.out.println();
        }
}

