class emptydiamond {
    public static void main(String[] args) {
        int n=7;
          int row=1;
          int st1=n/2+1,sp=-1;
          while (row<=n) {
            int i=1;
            while (i<=st1) {
              System.out.print("* ");
              i++;

                
            }
            int k=1;
            while (k<=sp) {
              System.out.print("  ");
              k++;
              
            }
            int j=1;
            if(row==n||row==1){
              j=2;
            }
            while (j<=st1) {
              System.out.print("* ");
              j++;
            }
            if (row<=n/2) {
              
              sp+=2;
              st1--;
            }
            else{
              sp-=2;
              st1++;
            }
            row++;  
            System.out.println();
    }}
}
