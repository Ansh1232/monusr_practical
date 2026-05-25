class num1 {
public static void main(String[] args) {
    int n=5;
    int sp=n;
    int st=1;
    int row=1;
    while (row<=n) {
        int i=1;
        while (i<=sp) {
            System.out.print("  ");
            i++;
        }
        int j=1;
        while (j<=st) {
            System.out.print(row+" ");
            j++;
        }
        row++;
        System.out.println();
        st+=2;
        sp--;
        
    }
}    
}
