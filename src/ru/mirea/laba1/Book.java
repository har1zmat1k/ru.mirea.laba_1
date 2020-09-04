package ru.mirea.laba1;

public class Book {
    private double _price = 0.0;
    private String _name = "Something";

    public Book(String name, double price) {
        _name = name;
        _price = price;
    }

    @Override
    public String toString() {
        return "The title of the book \"" + _name +"\" and its price " + _price;
    }
}
