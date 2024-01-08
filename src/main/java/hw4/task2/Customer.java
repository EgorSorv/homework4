package hw4.task2;

public class Customer {
    String name;
    String surname;
    int age;
    String number;

    public Customer(String name, String surname, int age, String number) {
        this.name = name;
        this.surname = surname;
        this.age  = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Имя клиента => " + name +
                ", фамилия клиента => " + surname +
                ", возраст => " + age +
                ", номер телеона => " + number;
    }

    public String getName() {
        return name;
    }
}
