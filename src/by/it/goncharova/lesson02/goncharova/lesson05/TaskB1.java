package by.it.goncharova.lesson02.goncharova.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("пельмени");
        arrayList.add("хлеб");
        arrayList.add("сметана");
        arrayList.add("молоко");
        arrayList.add("масло");
        System.out.println(arrayList.size());
        for (int i = 0; i <arrayList.size();i++) {
            int j=arrayList.size()-i-1;
            System.out.println(arrayList.get(j));


        } }
}


