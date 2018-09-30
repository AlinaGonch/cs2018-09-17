package by.it.goncharova.lesson02.goncharova.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int month = sc.nextInt();
        if (month<12||days<32)
        {
            int num = month;
            switch (month) { case 1:
                    num =(0);
                    break;
                case 2:
                    num = (31);
                    break;
                case 3:
                    num= (59);
                    break;
                case 4:
                    num =(90);
                    break;
                case 5:
                    num = (120);
                    break;
                case 6:
                    num = (151);
                    break;
                case 7:
                    num = (181);
                    break;
                case 8:
                    num = (212);
                    break;
                case 9:
                    num= (243);
                    break;
                case 10:
                    num = (273);
                    break;
                case 11:
                    num = (304);
                    break;
                case 12:
                    num = (334);
                    break;
            }
            System.out.println(num+days); }
            else if(month==0||month>12||days>32||days==0)
        {
            System.out.println("ошибка");
        }


    }}
