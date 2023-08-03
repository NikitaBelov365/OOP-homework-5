package task2;

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
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void saveUserChanges(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
    public void getUserInfo() {
        System.out.printf("Name: %s, Login: %s, password: %s%n", name, login, password);
    }

}
