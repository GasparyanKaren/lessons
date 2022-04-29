public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Garry", 25);
        person1.speak();
        person1.sayHello();
        System.out.println("My name is " + person1.name + "," + "i am " + person1.age);

        Person person2 = new Person();
//        person2.name = "Potter";
//        person2.age = 20;
//        person2.sayHello();
        person2.whatToDo();
        person2.setNameAndAge("Potter", 20);
        int year1 = person1.calculateyearsToRetirement();
        int year2 = person2.calculateyearsToRetirement();
        System.out.println("First person to retirement " + year1 + " years");
        System.out.println("Second person to retirement " + year2 + " years");
//        person2.speak();
//        System.out.println("My name is "+person2.name +","+"i am "+person2.age);


    }
}


class Person {
    //    У класса могут быть:
//    1. Данные (поля) (имя.возраст.цвет глаз)
//    2. Действия, которые он может совершать(методы) (ходить.говорить. итд)
    String name;
    int age;


    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;

    }


    int calculateyearsToRetirement() {
        int years = 65 - age;
        return years;


    }


    void speak() {
        for (int i = 0; i < 3; i++)
            System.out.println("my name is " + name + ", i am " + age);

        System.out.println();
    }

    void sayHello() {
        for (int i = 0; i < 3; i++)
            System.out.println("Here am i " + name + ", i am " + age);

        System.out.println();
    }


    void whatToDo() {
        for (int i = 0; i < 3; i++)
            System.out.println("i am " + name + " i want to go 90's before i will be " + age);


    }


}

