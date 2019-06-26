import java.util.*;
import package1.class1;

public class sum_and_xor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        long counter = 0;
        while(n != 0){
            if((n&1) == 0){
                counter ++ ;
            }
            n = n>>1;
        }

        long ans  = 1l << counter;
        
        System.out.println(ans);





    }
}