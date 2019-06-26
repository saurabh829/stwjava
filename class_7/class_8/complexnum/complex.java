package complexnum;
public class complex{
    int real;
    int img;
    public complex(int a,int b){
        real = a;
        img = b;
    }

    public complex add(complex c1){
        int newreal = real + c1.real;
        int newimg = img + c1.img;
        complex c2 = new complex(newreal,newimg);
        return c2;
    }

    public void printcomplex(){
        System.out.println(real +" + i"+img);
    }

}
