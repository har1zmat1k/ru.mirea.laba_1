package ru.mirea.laba1;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog(3, "Rex");
        System.out.println(dog.toString());

        Ball ball = new Ball("Basketball", 5.99);
        System.out.println(ball.toString());

        Book book = new Book("Something", 15.3);
        System.out.println(book.toString());
    }
}
