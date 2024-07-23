class ifelsedemo {
        public static void main(String[] args){
                char ch=97;
                System.out.println(ch=ch+8);//ch+=8 does not give error
                if(ch=='a'){
                        int x=5;
                        System.out.println(ch--+x);
                }
                else{
			int x=7;
                        System.out.println(ch++);
			System.out.println(x);
                }
                System.out.println(ch+=5);
                }
}

