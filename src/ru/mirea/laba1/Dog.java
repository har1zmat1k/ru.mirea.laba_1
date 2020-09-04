package ru.mirea.laba1;

public class Dog {
    private int _age = 0;
    private String _name = "Noting";

    public Dog(int age, String name) {
        _age = age;
        _name = name;
    }

    @Override
    public String toString() {
        return "The dog's name is " + _name +" and he is " + _age + " years old.";
    }
}
