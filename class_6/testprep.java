import java.util.Scanner;

public class testprep{


    public static void charge(int anum){
        anum++;
    }

    public static void main(String[] args){
        // double d = 26.9000;
        // int a = (int)26.9000;
        // System.out.println(a);

        // int a = 10/20*3;
        // System.out.println(a);

        // int a = 10;
        // a += 10;  // a = a+10
        // a -= 10*20; 
        // System.out.println(a);


        int a = 10;
        // a *= 10 + 30/20;
        int b = 20;
        int c = 30;
        a *= (b + c/ b);
        // a = a*(10 + 30/20);
        System.out.println(a);

        // int anum = 1;
        // add(anum);
        // System.out.println(anum);

        Scanner sc = new Scanner("1 a 2 b 3 c 4 d");
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        Object d = sc.nextLine();
        System.out.println(d);

        boolean abcd = true;



    }
}