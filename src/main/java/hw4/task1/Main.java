package hw4.task1;

import java.util.Scanner;

import static hw4.task1.Data.dataCheck;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = sc.nextLine();
        System.out.println();

        System.out.print("Введите пароль: ");
        String password = sc.nextLine();
        System.out.println();

        System.out.print("Подтвердите пароль: ");
        String confirmedPassword = sc.nextLine();
        System.out.println();

        boolean data = dataCheck(login, password, confirmedPassword);

        if (data) System.out.println("Логин и пароль успешно сохранены");
    }
}
