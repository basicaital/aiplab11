import java.util.Arrays;
import java.util.Scanner;

public class IntArrayProcessor {
    int[] intArray;
    int n;

    IntArrayProcessor(int n){
        this.n = n;
        intArray = new int[n];
    }
    void InputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");

        for (int i =0; i<n;i++){
            intArray[i] = sc.nextInt();
        }
    }

    void printArray(){
        System.out.println("Элементы массива: "+Arrays.toString(intArray));
    }
    void sortArray(){
        Arrays.sort(intArray);
    }

}
