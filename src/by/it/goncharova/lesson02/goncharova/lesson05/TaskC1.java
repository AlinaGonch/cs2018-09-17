package by.it.goncharova.lesson02.goncharova.lesson05;
/*
Три массива
1.  Введите с клавиатуры 20 чисел, сохраните их в список и рассортируйте по трём другим спискам:
    Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2.  Статический метод void printList(List<Integer> list) должен выводить на экран
    все элементы переданного ему списка list, каждый элемент - с новой строки.
3.  Используя метод printList выведите ваши три списка на экран.
    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaskC1 {
    public static void main(String[] args) throws Exception {
        int[] m = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < m.length; i++)
            list.add(m[i]);
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();
        ArrayList c = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            int k = list.get(i);
            if (k % 3 == 0 || k % 2 == 0) {
                if (k % 3 == 0) a.add(k);
                if (k % 2 == 0) b.add(k);
            } else c.add(k);
        } }
        static void printList(List < Integer> list){
            for (Integer aList : list) System.out.println(aList);
    }}



