//import java.util.InputMismatchException;
//import java.util.Scanner;

public class Salari {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static class Main {
        public static void main(String[] args) {
            Level myVar = Level.MEDIUM;

            switch(myVar) {
                case LOW:
                    System.out.println("Low level");
                    break;
                case MEDIUM:
                    System.out.println("Medium level");
                    break;
                case HIGH:
                    System.out.println("High level");
                    break;
            }
        }
    }