package com.example.testapp;


public class TestAppApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");

        AccountItem.StatusEnum statusEnum = SomeClass.mapStatus(SomeClass.Account.Status.UNKNOWN);
        System.out.println(statusEnum);
    }

}
