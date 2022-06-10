package com.company;

public class Lagman extends Food{
    private String meat;
    private int onion;
    private int pepper;
    private boolean noodle;

    public Lagman(String cooker, int quantity, String meat, int onion, int pepper, boolean noodle) {
        super(cooker, quantity);
        this.meat = meat;
        this.onion = onion;
        this.pepper = pepper;
        this.noodle = noodle;
    }

    @Override
    public void printer() {
        super.printer();
        System.out.println("Ingredients:"+
                "\nMeat -->"+meat+
                "\nOnion -->"+onion+
                "\nPepper -->"+pepper+
                "\nNoodle -->"+noodle);
    }
}
