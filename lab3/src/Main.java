import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int len = inp.nextInt();
        double[] arr = new double[len];
        for(int i = 0; i < len; i++) {
            System.out.printf("arr[%d]=", i);
            arr[i] = inp.nextDouble();
            System.out.println();
        }
        Arrays.sort(arr);
        System.out.println("Введите искомый элемент");
        double reqEl = inp.nextDouble();
        System.out.println(ExpSearch.Search(arr, reqEl));
    }
}