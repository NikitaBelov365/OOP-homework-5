package task1;

public class CalcModel {
    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    public double div(double value1, double value2) {
        if (value2 != 0) {
            return value1 / value2;
        } else {
            throw new IllegalArgumentException("Zero division");
        }
    }

    public double mul(double value1, double value2) {
        return value1 * value2;
    }

    public double sub(double value1, double value2) {
        return value1 - value2;
    }

    public void select(double num1, double num2, char operation) {
        double result = 0;
        switch (operation) {
            case '+' -> result = sum(num1, num2);
            case '-' -> result = sub(num1, num2);
            case '*' -> result = mul(num1, num2);
            case '/' -> result = div(num1, num2);
            default -> System.out.println("Incorrect operation");
        }
        System.out.println(result);
    }
}
