package ua.hillel.pashchenko;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //�������� ������ �������� n, ���������� �������� ����� ����� �� n �� 1 � �������� ������ 5 ���������;
        Scanner scanner = new Scanner(System.in);//������� ���� ����� �������������;
        int n;
        System.out.println("������� �������� n � �������:");
        n = scanner.nextInt();

        int[] array = new int[n];
        int k=n;
        //�������� ������ �������;
        for (int i=0; i<n; i++) {
            array[i]=k;
            k=k-1;
        }
        System.out.println("��� ������: "+ Arrays.toString(array));//����� �������;
        for (int i=0; i<5; i++){
            System.out.println(i+" ������� ������� : " + array[i]);
        }
    }
}