import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class reverse_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i=i+1){
            arr[i] = sc.nextInt();
        }
        
        for(int i=n-1;i>=0;i = i-1){
            System.out.printf(arr[i]+" ");
        }
        
    }
}
