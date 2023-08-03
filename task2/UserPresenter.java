package task2;

import java.util.ArrayList;

public class UserPresenter {
    UserModel user; // объявление
    UserView view;  // объявление

    public UserPresenter(UserModel userM, UserView viewV) { // конструктор
        user = userM;
        view = viewV;
    }

    public void startButton(){ // моя кнопка старта
        ArrayList<String> result = new ArrayList<>(view.startingScreen());
        String switcher = result.get(0);
        switch (switcher) {
            case "1" -> {
                user.setLogin(result.get(1));
                user.setPassword(result.get(2));
                user.setName(result.get(3));
                user.getUserInfo();
            }
            case "2" -> {
                if (user.getLogin().equals(result.get(1)) & user.getPassword().equals(result.get(2))) {
                    System.out.println("Log in successfully done!");
                    user.getUserInfo();
                }
            }
            case "3" -> {
                user.saveUserChanges(result.get(3), result.get(1), result.get(2));
                System.out.println("Password changed");
                user.getUserInfo();
            }
        }


    }
}
