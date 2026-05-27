public class gcd {
    public static void main(String[] args) {
        int m=6,n=12;
    int min=m<n?m:n;
int ans=1;
   for(int i=1;i<=min;i++){
    if(m%i==0&&n%i==0)
    ans=i;
   }
   System.out.println(ans);

    }
}
