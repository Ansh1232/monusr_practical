class num2 {


    public static void main(String[] args) {
        
        int n=5;
        int star=1;
        int row=1;
        int space=5;
        int n1=1;

        while (row<=n) {
            int sp=1;
            while (sp<=space) {
                System.out.print(" ");
                sp++;
                
            }
            int st=1;
            n1=1;
            while (st<=star) {
                System.out.print(n1);
                n1++;
                st++;
                
            }
            
            System.out.println();
            row++;
            star+=2;
            space--;
            
        }
    }
   
}
