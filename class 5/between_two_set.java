import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class between_two_set {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        int counter = 0;
        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
        }
        
        int min = b[0];
        for(int i=0;i<m;i++){
            if(min > b[i]){
                min = b[i];
            }
        }
        
        
        for(int i=1;i<=min;i++){
            
            //checking condition for b
            int is_b_satisfied = 1;
            for(int j=0;j<m;j++){
                if(b[j]%i != 0){
                    is_b_satisfied = 0;
                    break;
                }
            }
            
            //checking condition for a
            if(is_b_satisfied ==1){
                int is_a_satisfied = 1;
                for(int j=0;j<n;j++){
                    if(i%a[j]!=0){
                        is_a_satisfied = 0;
                        break;
                    }
                }
                
                if(is_a_satisfied == 1){
                    counter = counter+1;
                }  
                
            }
                        
        }
        
        System.out.println(counter);
        
    }
}
