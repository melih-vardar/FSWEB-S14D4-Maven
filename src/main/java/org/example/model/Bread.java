package org.example.model;

public class Bread extends ProductForSale{

    private boolean isExpired;

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, boolean isExpired) {
        super(type, price, description);
        this.isExpired = isExpired;
    }

    @Override
    public void showDetails() {
        System.out.println("Is the product expired? "+ isExpired);
    }

    public boolean isExpired() {
        return isExpired;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "isExpired=" + isExpired +
                '}';
    }
}
