package agh.to.model;

import java.util.Scanner;

public class Scientific {
    Scanner input = new Scanner(System.in);

    public void runOperation(ScientificOperations operation) {
        System.out.println("Wpisz liczby: ");

        switch (operation) {
            case POWER:
                power(input.nextInt(), input.nextInt());
                break;
            case FIBB:
                fibb(input.nextInt());
                break;
            case SINUS:
                sinus(input.nextDouble());
                break;
            default:
                System.out.println("Need a number!");
                break;
        }
    }

    void power(int input1, int input2) {
        int result = input1;

        if (input2 == 0) result = 1;

        for (int i = 1; i < input2; i++) {
            result *= input1;
        }

        System.out.println(result);
    }

	void sinus(double input) {
        System.out.println(Math.sin(input));
	}

	void fibb(int input) {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < input) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}
