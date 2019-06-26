import complexnum.complex;
import java.util.*;

public class complex_package{
    public static void main(String[] args) {
        complex c = new complex(1,2);
        complex c1 = new complex(2,2);
        complex c3 = c.add(c1);
        c3.printcomplex();
        Vector v = new Vector(1);
        v.addElement(100);
        // v.addElement("hello");

    }
}
