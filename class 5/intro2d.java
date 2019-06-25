
class rectangle{
    int len;
    int bredth;

    rectangle(int l,int b){
        len = l;
        bredth = b;
    }

    int area(){
        return len*bredth;
    }
    int perimeter(){
        return 2*(len+bredth);
    }
    void setlen(int l,int b){
        len = l;
        bredth = b;
    }

}




public class intro2d{
    public static void main(String[] args){
        // double d = 1.23456;
        // System.out.println(d);

        // float f = 1.234f;
        // System.out.println(f);

        // short s = 12;
        // System.out.println(s);

        // byte b = 127;
        // System.out.println(b);

        // char a = 'a';
        // System.out.println(a);

        // for(int i=0;i<255;i++){
        //     System.out.print((char)i);
        // }


        // rectangle r1 = new rectangle(3,2);
        // r1.setlen(1,2);
        // System.out.println(r1.len + " "+r1.bredth);

    }
}