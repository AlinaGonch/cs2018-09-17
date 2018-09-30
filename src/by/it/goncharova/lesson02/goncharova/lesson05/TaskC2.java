package by.it.goncharova.lesson02.goncharova.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);
    }
    public static void sort(int[] array) {
            int a,b,k;
            for(a=1; a <array.length; a++)
                for(b=array.length-1; b >= a; b--) {
                    if(array[b-1] > array[b]) {
                        k = array[b-1];
                        array[b-1] = array[b];
                        array[b] = k;
                    }
                }for(int i=array.length-1;i>=0;i--)
        System.out.println( array[i]);
        }
    }

