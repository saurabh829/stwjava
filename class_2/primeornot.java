import java.util.Scanner;
import java.lang.Math;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int mila_ya_nahi_mila = 0;
        
        for(int i=2;i*i<=n;i=i+1){
            if(n%i==0){
                mila_ya_nahi_mila = 1;
                break;
            }
        }
        
        if(mila_ya_nahi_mila == 1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }

        
        
     }
}