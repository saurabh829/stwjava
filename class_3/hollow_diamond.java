import java.util.Scanner;
public class hollow_diamond{

    public static void printstar(int n){
        for(int i=0;i<n;i=i+1){
            System.out.printf("*");
        }
    }


    
    public static void printspace(int n){
        for(int i=0;i<n;i=i+1){
            System.out.printf(" ");
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            // n-i-1 space print karne hai
            printspace(n-i-1);

            //print 1 star
            printstar(1);

            if(i!=0){

                // print 2*i -1 spaces
                printspace(2*i-1);

                //print one stars
                printstar(1);
        
            }
            System.out.println();
        }


        for(int i=0;i<n-1;i++){
            // print spaces
            printspace(i+1);
            //print 1 star
            printstar(1);
            if(i != n-2)
            {
                // print spaces
                printspace(2*(n-i-2)-1);
                //print star
                printstar(1);
            }
            // print next line
            System.out.println();
        }





    }
}