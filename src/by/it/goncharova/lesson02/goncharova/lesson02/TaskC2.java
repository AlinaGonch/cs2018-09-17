package by.it.goncharova.lesson02.goncharova.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=sc.nextInt() ;
        int b=sc.nextInt() ;
        int k=i+b;
        System.out.println("DEC" + ":" + i + "+" + b + "=" + k);
        System.out.println("BIN" + ":" + Integer.toBinaryString(i) + "+" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(k));
        System.out.println("HEX" + ":" + Integer.toHexString(i) + "+" + Integer.toHexString(b) + "=" + Integer.toHexString(k));
        System.out.println("OCT" + ":" + Integer.toOctalString(i) + "+" + Integer.toOctalString(b) + "=" + Integer.toOctalString(k));
    }


}
