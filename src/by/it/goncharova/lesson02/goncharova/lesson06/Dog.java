package by.it.goncharova.lesson02.goncharova.lesson06;

public class Dog {
    private String name;
    private int age;

   public Dog()  {

    }public Dog(String name, int age){
       this.name= name;
       this.age=age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кличка: "+name+"."+" Возраст: "+age;
    }
}
