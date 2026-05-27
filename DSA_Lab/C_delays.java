import java.util.Scanner;
class C_delays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean d=false;
        int count=1;
        int delays=sc.nextInt();
        int ar[]=new int[delays];

        for (int i=0;i<delays;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length-1;i++){
            int current=ar[i];
            if (ar[i+1]>current){
                count++;
                if(count>=3) {
                    d=true;
                    break;
                }
            }
            else{
                count=1;
            }
            }
        
            System.out.println(d?"Issue":"No Issue");
        }
    }

    

