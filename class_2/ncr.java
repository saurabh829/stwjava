import java.util.Scanner;
import java.lang.Math;

public class HelloWorld{
    
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int ans = factorial(n)/(factorial(n-r)*factorial(r));
        System.out.println(ans);
        
     }
}