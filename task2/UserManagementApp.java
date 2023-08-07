package task2;

public class UserManagementApp {
    public static void main(String[] args) {


        UserModel um = new UserModel();
        UserView uv = new UserView();
        UserPresenter presenter = new UserPresenter(um, uv);

        presenter.startButton();

    }
}
