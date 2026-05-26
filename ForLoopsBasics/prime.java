class prime{
    public static void main(String[] args) {
        int n=99;
        int count =0;
        boolean Prime=true;
        for(int i=2;i<n;i++){
            if(n%i==0)count++;

        }
        if (count>=1) {
            Prime=false;
        }
        if (Prime) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
