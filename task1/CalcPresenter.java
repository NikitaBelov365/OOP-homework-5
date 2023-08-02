package task1;

public class CalcPresenter {
    private CalcModel model = new CalcModel();
    private CalcView view = new CalcView();

    public CalcPresenter(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }
    public void start(){
        double num1 = view.userInput();
        double num2 = view.userInput();
        char operation = view.chooseOperation();
        model.select(num1, num2, operation);
    }

}
