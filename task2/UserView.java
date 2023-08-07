package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class UserView {
    Scanner scanner = new Scanner(System.in); //подключаем сканнер заранее

    public String inputName() { // метод ввода имени
        System.out.println("Input user name: ");
        return scanner.nextLine();
    }

    public String inputLogin() { // метод ввода логина
        System.out.println("Input user login: ");
        return scanner.nextLine();
    }

    public String inputPassword() { // метод ввода пароля
        System.out.println("Input user password: ");
        return scanner.nextLine();
    }

    public ArrayList<String> registrationForm() { // форма регистрации, возвращающая нужные данные массивом
        System.out.println("We need some data now.");
        ArrayList<String> registrationForm = new ArrayList<>(4);
        registrationForm.add("1");
        registrationForm.add(inputLogin());
        registrationForm.add(inputPassword());
        registrationForm.add(inputName());
        return registrationForm;
    }

    public ArrayList<String> loginForm() { // форма логина в программу через массив
        ArrayList<String> loginForm = new ArrayList<>(3);
        System.out.println("For log in we need your login first: ");
        loginForm.add("2");
        loginForm.add(inputLogin());
        loginForm.add(inputPassword());
        return loginForm;
    }

    public ArrayList<String> changePasswordForm() { // метод смены пароля
        ArrayList<String> changePasswordForm = new ArrayList<>(4);
        System.out.println("To change password enter name, login and new password");
        changePasswordForm.add("3");
        changePasswordForm.add(inputLogin());
        changePasswordForm.add(inputPassword());
        changePasswordForm.add(inputName());
        return changePasswordForm;
    }


    public ArrayList<String> startingScreen() { // метод стартовой страницы, которую видит юзер
        System.out.println("Hello, welcome to my login program. What do you want to do?");
        System.out.println("1 - register, 2 - you already have account");
        int firstSwitcher = scanner.nextInt();
        scanner.nextLine();
        switch (firstSwitcher) {
            case 1 -> {
                return registrationForm();
            }
            case 2 -> {
                System.out.println("What do you want to do?");
                System.out.println("1 - login, 2 - change password");
                int secondSwitcher = scanner.nextInt();
                switch (secondSwitcher) {
                    case 1 -> {
                        return loginForm();
                    }
                    case 2 -> {
                        return changePasswordForm();
                    }

                }
            }
        }
        return null;
    }
}
