package com.company;

public class Manty extends Food{
    private String meat;
    private int onion;
    private int potato;
    private boolean noodle;

    public Manty(String cooker, int quantity, String meat, int onion, int potato, boolean noodle) {
        super(cooker, quantity);
        this.meat = meat;
        this.onion = onion;
        this.potato = potato;
        this.noodle = noodle;
    }

    @Override
    public void printer() {
        super.printer();
        System.out.println("Ingredients:"+
                "\nMeat -->"+meat+
                "\nOnion -->"+onion+
                "\nPotato -->"+potato+
                "\nNoodle -->"+noodle);

    }
}
