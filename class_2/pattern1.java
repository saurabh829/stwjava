import java.util.Scanner;
import java.lang.Math;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            // print i+1 star
            for(int j =0;j<i+1;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        
        
     }
}