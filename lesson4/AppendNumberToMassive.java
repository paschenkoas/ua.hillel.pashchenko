package ua.hillel.pashchenko.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class AppendNumberToMassive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //user inputs massive;
        System.out.println("введите целое число - размер массива ");
        int n=scanner.nextInt();
        int [] mass1 = new  int [n];
        System.out.println("введите массив чисел ");
        for(int i=0;i<mass1.length;i++) {
            mass1[i]=scanner.nextInt();
        }
        Arrays.sort(mass1);// sortyng massive;
        System.out.println(Arrays.toString(mass1)+" введенный массив");//это наш массив;
        System.out.println("введите число которое нужно вставить в массив");
        int number=scanner.nextInt();
        int [] mass2 = new int [n+1];
        mass2[n]=number;
        for (int i = 0; i < mass1.length; i++) {
            mass2[i]=mass1[i];
        }
        System.out.println(Arrays.toString(mass2)); //вывод полученного без сортировки;

 /*
        //сортировка bubble;
        for (int i = mass2.length-1;i>0 ;i--) {
            for (int j = 0; j < i; j++) {
                if( mass2[j] > mass2[j+1] ){
                    int tmp = mass2[j];
                    mass2[j] = mass2[j+1];
                    mass2[j+1] = tmp;
                }
            }
        }*/
        //сортировка Selection;
       /* for (int i = 0; i < mass2.length; i++) {
            int min = mass2[i];
            int min_i = i;
           for (int j = i+1; j < mass2.length; j++) {
                if (mass2[j] < min) {
                    min = mass2[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = mass2[i];
                mass2[i] = mass2[min_i];
                mass2[min_i] = tmp;
            }
        }*/
        Arrays.sort(mass2);// сортировка массива;
        System.out.println(Arrays.toString(mass2)); //вывод отсортированного;
    }
}
