import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sock {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bucket = new int[101];
        for(int i=0;i<n;i++){
            int newnum = sc.nextInt();
            bucket[newnum]++;
        }
        int total_socks = 0;
        for(int i=0;i<101;i++){
            total_socks = total_socks + bucket[i]/2;
        }
        
        System.out.println(total_socks);
        
    }
}
