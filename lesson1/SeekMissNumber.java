import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeekMissNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//добавил ввод числа пользователем;
        int n;
        System.out.println("Введите значение n в консоль:");
        n = scanner.nextInt();
        //int n=8;//chislo elementov;
        int S=0;//summa elementov;
        int Sn=((n)*(n+1))/2;//summa elementov ot 1 do n;
        int k=n-1;
        int[] array = new int[n];
        int[] array1 = new int[k]; //massiv s propushchenim chislom;
        Random rand = new Random();
        //zapolnayem massiv v randomnom porjadke;
        for (int i=0; i<n; ++i) {
            int j = rand.nextInt(i + 1);
            array[i] = array[j];
            array[j] = i + 1;
        }
        //zapolnayem massiv v kotorom budem iskat;
        for (int i=0; i<k; i++) {
            array1[i]=array[i];
        }
        //nahodim summu elementov massiva s propushchenim chislom;
        for (int i=0; i<k; i++) {
            S=S+array1[i];
        }
        System.out.println("это наш массив чисел : "+Arrays.toString(array1));
        System.out.println("пропущенное число "+(Sn-S));
    }
}