class complexnumber{
    int real;
    int img;
    complexnumber(int a,int b){
        real = a;
        img = b;
    }

    complexnumber add(complexnumber c1){
        int newreal = real + c1.real;
        int newimg = img + c1.img;
        complexnumber c2 = new complexnumber(newreal,newimg);
        return c2;
    }

    void printcomplex(){
        System.out.println(real +" + i"+img);
    }

}




public class complex{
    public static void main(String[] args) {
        complexnumber comp1 = new complexnumber(1,2);
        comp1.printcomplex();
        complexnumber comp2  = new complexnumber(2,3);
        complexnumber comp3 =  comp1.add(comp2);
        comp3.printcomplex();
    }
}