package org.example;

public class Main {
    public static void main(String[] args) {
        MyArray arr = new MyArray();

        arr.put("1st");
        arr.put("2nd");
        arr.put("3rd");
        arr.put("4rd");
        arr.put("5rd");


        System.out.println("Довжина: " + arr.length());
        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println(arr.get());
        System.out.println("Довжина: " + arr.length());

        System.out.println(arr.get());
        System.out.println(arr.get());

        System.out.println("Довжина перед тим як покласти елемент: " + arr.length());
        arr.put("new Elem");
        System.out.println("Довжина після того, як поклали: " + arr.length());
        System.out.println(arr.get());


    }

}