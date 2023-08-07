package task2;

import java.util.ArrayList;

public class UserPresenter {
    UserModel user; // объявление
    UserView view;  // объявление

    public UserPresenter(UserModel userM, UserView viewV) { // конструктор
        user = userM;
        view = viewV;
    }

    private enum Operation {
        REGISTRATION(1),
        LOGIN(2),
        CHANGEPASSWORD(3);

        private final int value;

        Operation(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    public void startButton(){ // моя кнопка старта
        ArrayList<String> result = new ArrayList<>(view.startingScreen());
        Operation switcher = Operation.values()[Integer.parseInt(result.get(0)) - 1];
        switch (switcher) {
            case REGISTRATION -> {
                registrationButton(result);
            }
            case LOGIN -> {
                loginButton(result);
            }
            case CHANGEPASSWORD -> {
                changePasswordButton(result);
            }
        }
    }
    private void registrationButton(ArrayList<String> result) {
        user.setLogin(result.get(1));
        user.setPassword(result.get(2));
        user.setName(result.get(3));
        user.getUserInfo();
    }
    private void loginButton(ArrayList<String> result) {
        if (user.getLogin().equals(result.get(1)) & user.getPassword().equals(result.get(2))) {
            System.out.println("Log in successfully done!");
            user.getUserInfo();
        }
    }
    private void changePasswordButton(ArrayList<String> result) {
        user.saveUserChanges(result.get(3), result.get(1), result.get(2));
        System.out.println("Password changed");
        user.getUserInfo();
    }
}
