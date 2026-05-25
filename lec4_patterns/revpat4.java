class revpat4 {
    public static void main(String[] args) {
        { int n=7;
            int star=n/2+1;
            int row=1;
            int space=-1;
            while (row<=n) {
                int st=1;
                while (st<=star) {
                    System.out.print("* ");
                    st++;
                }
                int sp=1;
                while(sp<=space){
                    System.out.print("  ");
                    sp++;
                }
                int st2=1;
                if(row==1 || row==n) {
                    st2=2;
                }
                while (st2<=star) {
                    System.out.print("* ");
                    st2++;
                }
                if(row<=n/2){
                    star--;
                    space+=2;}
                    else{
                        star++;
                        space-=2;
                    }
                    row++;
                    System.out.println();
                
            }
        }
    }
}
