public class Triangle{
    int a, b, c;
    Triangle(int a, int b, int c ){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int getA(){
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    int Perimeter(){
        return a+b+c;
    }
    double Area(){
        double s = Perimeter()/2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
