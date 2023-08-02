package task1;

import java.util.Scanner;

public class CalcView {
    Scanner scanner = new Scanner(System.in);

    public double userInput() {
        System.out.println("Input number bro: ");
        return scanner.nextDouble();
    }

    public void showOut(double value){
        System.out.println("Output result: " + value);
    }

    public char chooseOperation() {
        System.out.println("Input operation: + - * / \n");
        return scanner.next().charAt(0);
    }
}
