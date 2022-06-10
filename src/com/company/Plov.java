package com.company;

public class Plov extends Food{
    private String meat;
    private int onion;
    private int carrot;
    private boolean rice;

    public Plov(String cooker, int quantity, String meat, int onion, int carrot, boolean rice) {
        super(cooker, quantity);
        this.meat = meat;
        this.onion = onion;
        this.carrot = carrot;
        this.rice = rice;
    }

    @Override
    public void printer() {
        super.printer();
        System.out.println("Ingredients:"+
                "\nMeat -->"+meat+
                "\nOnion -->"+onion+
                "\nCarrot -->"+carrot+
                "\nRice -->"+rice);
    }
}
