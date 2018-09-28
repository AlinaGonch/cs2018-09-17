package by.it.goncharova.lesson02.goncharova.lesson06;

public class Doghelper {
    static void printAllNames(Dog[] dogs){
        for (Dog dog: dogs){
            System.out.println(dog.getName()+""+dog.getAge());
        }
        System.out.println();
    }
    static double averageAge(Dog[] dogs){
        double sum=0;
        for(Dog dog: dogs)
        {sum=sum+dog.getAge();}
        return sum/dogs.length;
    }
}
