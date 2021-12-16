package agh.to.model;

import java.util.Scanner;

public class Basic {
    Scanner input = new Scanner(System.in);

    public void runOperation(BasicOperations operation) {
        System.out.println("Wpisz liczby: ");

        switch (operation) {
            case DIVIDE:
                divide(input.nextInt(), input.nextInt());
                break;
            case MULTIPLY:
                multiply(input.nextInt(), input.nextInt());
                break;
            case SUBTRACT:
                subtract(input.nextInt(), input.nextInt());
                break;
            case ADD:
                add(input.nextInt(), input.nextInt());
                break;
            default:
                System.out.println("Need a number!");
                break;
        }
    }

    void multiply(int input1, int input2) {
        System.out.println(input1 * input2);
    }

    void divide(int input1, int input2) {
        System.out.println(input1 / input2);
    }

    void subtract(int input1, int input2) {
        System.out.println(input1 - input2);
    }

    void add(int input1, int input2) {
        System.out.println(input1 + input2);
    }
}

