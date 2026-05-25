class num4 {
    public static void main(String[] args) {
         
        int n=5;
        int star=1;
        int row=1;
        int space=n-1;
        int n1=1;

        while (row<=n*2-1) {
            int sp=1;
            while (sp<=space) {
                System.out.print("  ");
                sp++;
                
            }
            int st=1;
       
            while (st<=star) {
                System.out.print(n1+" ");
                
                if (st>star/2) {
                    n1-=1;
                }
                else{
                    n1+=1;
                }
                st++;
                

                
            }
            
            System.out.println();
            row++;
            n1++;
           
        
            if(row<n){
                star+=2;
                n1++;
                space--;
            }else{
                star-=2;
                n1--;
                space++;
            }
        }
    }
    
}
