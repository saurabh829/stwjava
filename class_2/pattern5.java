import java.util.Scanner;
import java.lang.Math;

public class HelloWorld{
    
    public static void printnstar(int n1){
        for(int i=0;i<n1;i++){
            System.out.printf("*");
        }
    }
    
    public static void printnspace(int n1){
        for(int i=0;i<n1;i++){
            System.out.printf(" ");
        }
    }
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            // print some spaces
            
            printnspace(i);
            
            // print some stars
            
            printnstar(2*n-1-2*i);
            
            //print next line
            System.out.println();
            
        }
        
        
     }
}