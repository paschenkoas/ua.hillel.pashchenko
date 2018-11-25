package ua.hillel.pashchenko;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Создайте массив размером n, элементами, которого будут числа от 1 до n
        Scanner scanner = new Scanner(System.in);//добавил ввод числа пользователем;
        int n;
        System.out.println("Введите значение n в консоль:");
        n = scanner.nextInt();
        int[] array = new int[n];
        int Sn=((n)*(n+1))/2;//summa elementov ot 1 do n;
        double Sn1=Sn,n1=n;
        double Sr=Sn1/n1;
        int sum=0;//сумма минимального и максимального элементов массива;
        long multiply_non2=1;
        boolean a=false;
        //заполним массив числами по возрастанию;
        for (int i=0; i<n; i++) {
            array[i]=i+1;
            if (array[i]%3==0){System.out.println(array[i]+" - делится на 3 без остатка");}
            if (array[i] % 2 == 0) {System.out.println("четный элемент: " + array[i]);}
            sum=array[0]+array[n-1];
            if (array[i]%2!=0){multiply_non2=multiply_non2*array[i];}//считаем произведение нечетных элементов массива;
       }
        for (int i=0; i<n; i++) {
            if (array[i]==n){
                System.out.println("позиция (индекс) элемента с числом n - "+i);
                a=true;
            }
        }
        if (a==false){ //10 пункт домашнего задания;
            System.out.println("элемент равный n отсутствует");
        }
        System.out.println("наш массив: "+Arrays.toString(array));//вывод массива;
        System.out.println("сумма элементов массива = "+Sn);
        System.out.println("среднее арифметическое массива = "+Sr);
        System.out.println("сумма минимального и максимального элементов = "+sum);
        System.out.println("произведение нечетных элементов = "+multiply_non2);
    }
}