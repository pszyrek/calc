package agh.to.model;

import java.util.Scanner;

public class Calculator {
	private Mode mode = Mode.SIMPLE;
	private BasicOperations basicOperation;
	private ScientificOperations scientificOperation;
	private Scientific scientific = new Scientific();
    private Basic basic = new Basic();
    private char op;

    Scanner input = new Scanner(System.in);

    public void chooseMode() {
		System.out.println("Choose mode:\n 1. Simple\n 2. Scientific");
		op = input.next().charAt(0);
		if (op == '2') {
			setMode(Mode.SCIENTIFIC);
		}
	}

	public void chooseOperation() {
		if (this.mode == Mode.SCIENTIFIC) {
			System.out.println("Enter the operator:\n a. Power\n b. Sinus\n c. Fibb");
			op = input.next().charAt(0);
			switch (op) {
				case 'a' -> setScientificOperation(ScientificOperations.POWER);
				case 'b' -> setScientificOperation(ScientificOperations.SINUS);
				case 'c' -> setScientificOperation(ScientificOperations.FIBB);
			}
		} else {
			System.out.println("Enter the operator +, -, *, /");
			op = input.next().charAt(0);
			switch (op) {
				case '+' -> setBasicOperation(BasicOperations.ADD);
				case '-' -> setBasicOperation(BasicOperations.SUBTRACT);
				case '*' -> setBasicOperation(BasicOperations.MULTIPLY);
				case '/' -> setBasicOperation(BasicOperations.DIVIDE);
			}
		}
	}

	public void run() {
		chooseMode();
		chooseOperation();
		if(mode == Mode.SCIENTIFIC){
            scientific.runOperation(scientificOperation);
		} else {
            basic.runOperation(basicOperation);
		}
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

	public void setBasicOperation(BasicOperations operator) {
		this.basicOperation = operator;
	}

	public void setScientificOperation(ScientificOperations operator) {
		this.scientificOperation = operator;
	}
}
