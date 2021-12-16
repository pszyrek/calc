package agh.to.model;

public enum BasicOperations {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public String toString() {
        return switch (this) {
            case ADD -> " + ";
            case SUBTRACT -> " - ";
            case MULTIPLY -> " * ";
            case DIVIDE -> " / ";
        };
    }
}
