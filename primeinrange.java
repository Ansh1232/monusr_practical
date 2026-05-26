class primeinrange{
    public static void main(String[] args) {
        int start=2,end=100;
        for(int i=start;i<=end;i++){
            
            boolean p=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    p=false;
                    break;
                }
                
                
            }
            if(p==true){
            System.out.println(i);
        }}
    }
}