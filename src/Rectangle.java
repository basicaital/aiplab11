public class Rectangle {
    int a, b;

    Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    int PerimetrRectangle(){
        return 2*(a+b);
    }
    double SquareRec(){
        return 0.5*(a*b);
    }
}
