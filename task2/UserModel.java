package task2;

import java.io.IOException;

public class UserModel {
    String name;
    String login;
    String password;

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        try {
            this.name = name;
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Имя пользователя не может быть пустым");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void setLogin(String login) {
        try {
            this.login = login;
            if (login.isEmpty()) {
                throw new IllegalArgumentException("Логин не может быть пустым");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }

    }

    public void setPassword(String password) {
        try {
            this.password = password;
            if (password.isEmpty()) {
                throw new IllegalArgumentException("Пароль не может быть пустым");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public void saveUserChanges(String name, String login, String password) { // метод сохранения изменений
        setName(name);
        setLogin(login);
        setPassword(password);
    }
    public void getUserInfo() { // инфа о юзере
        System.out.printf("Name: %s, Login: %s, password: %s%n", name, login, password);
    }

}
