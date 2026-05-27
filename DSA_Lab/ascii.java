import java.util.Scanner;
class ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean d=false;
        int count=1;
        // int delays=sc.nextInt();
        String pass="CAEF";
        char ar[]=pass.toCharArray();


        // for (int i=0;i<delays;i++){
        //     ar[i]=sc.nextInt();
        // }
    
    
        for(int i=0;i<ar.length-1;i++){
            int current=ar[i];
                if (ar[i+1]>current){
                        count++;
                        if(count>=2) {
                                d=true;
                                break;
                            }
                        }
                        else{
                                count=1;
                                
                            }
                        }
                        System.out.println(d?"Weak":"Strong");
                        // System.out.println(count);
        
        }
    }

    

