package by.it.goncharova.lesson02.goncharova.lesson03;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
  protected static int sumDigitsInNumber(int i) {
      int k= i/1000;
      int m=i/100-(k*10);
      int l=i/10-(k*100)-(m*10);
      int n=i-((k*1000)+(m*100)+(l*10));
      return k+m+l+n;
  }

    public static void main(String[] args) {
      int i=5467;
      int sum=sumDigitsInNumber(i);
      System.out.println(sumDigitsInNumber(5467));
  }}


