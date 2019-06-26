package package1;

class A{
    int x;
    int y;
    A(int a,int b){
        x =1;
        y = 2;
        System.out.println("Constructor of A is Created");
    }

    void foo(){
        System.out.println("Foo of A is called");
    }
}


class B extends A{
    static int s1 = 0;
    int x1;
    B(){
        super(1,2);
        s1++;
        x1 = 3;
        int x = 100;
        System.out.println(super.x);
        System.out.println("Cosnstructor of B is called");
    }

    void foo1(){
        System.out.println("foo1 of B is called");
    }


}


public class class1{
    public static void main(String[] args) {
        B b = new B();
        b.foo();
        // System.out.println(b.x+" "+b.y);
        System.out.println(b.s1);
        B b1 = new B();
        System.out.println(B.s1);

    }
}