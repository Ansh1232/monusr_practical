class num3 {


    public static void main(String[] args) {
        
        int n=10;
        int star=1;
        int row=1;
        int space=n-1;
        int n1=1;

        while (row<=n) {
            int sp=1;
            while (sp<=space) {
                System.out.print("  ");
                sp++;
                
            }
            int st=1;
            n1=1;
            while (st<=star) {
                System.out.print(n1+" ");
                
                if (st>star/2) {
                    n1-=1;
                }
                else{
                    n1++;
                }
                st++;
                
            }
            
            System.out.println();
            row++;
            star+=2;
            space--;
            
        }
    }
   
}
//in number patterns mirroring is done vertically ...and in star patterns we always do horizontal mirroring