class A{
    int x;
    int y;
    A(){
        x =1;
        y = 2;
        System.out.println("Constructor of A is Created");
    }

    void foo(){
        System.out.println("Foo of A is called");
    }
}


class B extends A{
    int x1;
    B(){
        x1 = 3;
        System.out.println("Cosnstructor of B is called");
    }

    void foo1(){
        System.out.println("foo1 of B is called");
    }
}


public class inheritence{
    public static void main(String[] args) {
        B b = new B();
        b.foo();
        System.out.println(b.x+" "+b.y);
    }
}