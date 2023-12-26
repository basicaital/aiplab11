import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(1,2,3);
        Rectangle rec1 = new Rectangle(5,6);
        System.out.println("Длина сторон треугольника: "+"a = "+tr1.getA()+" "+"b = "+tr1.getB()+ " "+"c = "+tr1.getC()+"Периметр треугольника ="+" "+tr1.Perimeter()+"\n"+"Площадь треугольника ="+" "+tr1.Area());
        System.out.println("Длина сторон прямоугольного треугольника : "+"а = "+rec1.getA()+","+" "+"b = "+rec1.getB());
        System.out.println("Периметр прямоугольного треугольника: "+rec1.PerimetrRectangle()+"\n"+"Площадь = "+" "+rec1.SquareRec());

        IntArrayProcessor arrayProcessor = new IntArrayProcessor(5);
        arrayProcessor.InputArray();
        arrayProcessor.printArray();
        arrayProcessor.sortArray();
        System.out.println("Отсортированный массив: "+ Arrays.toString(arrayProcessor.intArray));
    }
}