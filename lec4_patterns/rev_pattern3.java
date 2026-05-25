public class rev_pattern3 {
    public static void main(String[] args) {
        int n=5;
      int  row=1;
      int star=5;
        int space=5;

        while(row<=n*2-1){
               int sp=1;
            while (sp<=space) {
                System.out.print("   ");
                sp++;
            }
        
            int st=1;
           
            while (st<=star) {
                System.out.print("* ");
                st++;
            }
            System.out.println();
            
            if(row<n)
            {
                star--;
                space--;
            }
            else{
                star++;
                space++;
            }
            row++;
        }
    }
}
