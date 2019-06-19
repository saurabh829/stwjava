import java.util.Scanner;
public class array_intro{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr ;
        arr = new int[n];

        for(int i=0;i<n;i++){
            int inp = sc.nextInt();
            arr[i] = inp;
        }

        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int inp1  = sc.nextInt();
            int sum = 0;
            for(int j=0;j<inp1;j++){
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }

    }
}