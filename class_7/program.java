

class line{
    double m,c;
    line(double m1,double c1){
        m = m1;
        c = c1;
    }
    
    void printline(){
        System.out.println("y = " + m +"x + "+ c);
    } 

    point intersection(line l){
        double x1 = (l.c - c)/(m-l.m);
        double y1 = m*x1 + c;
        point p1 = new point(x1,y1);
        return p1;
    }


}



class point{


    double x ;
    double y;
    point(double x1,double y1){
        x = x1;
        y = y1;
    }

    double dist(point p1){
        double dist1 = Math.sqrt(((p1.x-x)*(p1.x-x))+((p1.y-y)*(p1.y-y)));
        return dist1;
    }

    line construct_line(point p1){
        double m1 = (p1.y - this.y)/(p1.x - this.x);
        double c1 = y -(m1*x);
        line l1 = new line(m1,c1);
        return l1;
    }

    void printpoint(){
        System.out.println("("+x+" , "+y+")");
    }

}

public class program{
    public static void main(String[] args) {
        // point p1 = new point(1,1);
        // point p2 = new point(2,2);
        // System.out.println(p1.dist(p2));
        // line l1 = p1.construct_line(p2);
        // l1.printline();

        line l1 = new line(9,3);
        line l2 = new line(7,4);
        point p1 = l1.intersection(l2);
        p1.printpoint();

    }
}