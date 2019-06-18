import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int ans = a;
            int currpowerof2  = 1;
            for(int j=0;j<n;j++){
                ans = ans+currpowerof2*b;
                currpowerof2 = currpowerof2 * 2;
                System.out.printf("%d ",ans);
            }
            
            System.out.println();
            
            
        }
        in.close();
    }
}