package org.example;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.printNumbers();
    }

    public void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}

