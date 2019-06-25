import java.util.Scanner;

public class test2{
    int x = 5;
    static int y = 10;
    public void test1(){
        int x = 10;
        int y = 100;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(y);
        System.out.println(test2.y);
    }

    public static void main(String[] args){
        test2 a = new test2();
        a.test1();
    }
}
