package ru.mirea.laba1;

public class Ball {
    private double _price = 0.0;
    private String _type = "None";

    public Ball(String type, double price) {
        _price = price;
        _type = type;
    }

    @Override
    public String toString() {
        return _type + " type ball and its price " + _price;
    }
}
