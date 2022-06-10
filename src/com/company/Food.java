package com.company;

public class Food implements Printable{
    private String cooker;
    private int quantity;

    public Food(String cooker, int quantity) {
        this.cooker = cooker;
        this.quantity = quantity;
    }

    public String getCooker() {
        return cooker;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void printer() {
        System.out.println("_____________________________"+"\nCooker :"+cooker+"" +
                "\nQuantity :"+quantity);
    }
}
