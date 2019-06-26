import java.util.*;
public class find_duplicate{
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xorr = 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            xorr = xorr^x;
        }

        System.out.println(xorr);
    }
}
//certiport.com/Students/portal/Registraion.aspx