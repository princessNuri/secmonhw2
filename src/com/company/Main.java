package com.company;

public class Main {

    public static void main(String[] args) {
        Food lagman = createFood("Lagman");
        Food manty = createFood("Manty");
        Food plov = createFood("Plov");
        plov.printer();
        lagman.printer();
        manty.printer();
    }
    public static Food createFood(String className) {
        switch (className) {
            case "Plov":
                Plov plov = new Plov("Plovmaker", 2, "beef", 3, 5, true);
                return plov;
            case "Manty":
                Manty manty = new Manty("Mantymaker", 5, "mutton", 4, 2, true);
                return manty;
            case "Lagman":
                Lagman lagman = new Lagman("Lagmanmaker", 1, "beef", 5, 3, true);
                return lagman;
        }
        return null;
    }
}
