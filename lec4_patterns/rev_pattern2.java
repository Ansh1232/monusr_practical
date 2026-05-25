class rev_pattern2

{
    public static void main(String[] args) {
        int n=10;
        int stars=1;
        int rows=1;
       int  space=n-1;
     
        while (rows<=n*2-1) {
            int sp=1;
            while (sp<=space) {
                System.out.print(" ");
                sp++;
                
            }
            int st=1;
            while(st<=stars){

                System.out.print("*");
                
                st++;
             
            }
            //   int sp2=1;
            // while (sp2<=space2) {
            //     System.out.print("  ");
            //     sp2++;
                
            // }
            System.out.println();
            rows++;
            if(rows<=n){
            stars++;
            space--;
        }
            else{
                stars--;
                space++;
            }
            // space--;
            // space2++;
            
        }
    }
}