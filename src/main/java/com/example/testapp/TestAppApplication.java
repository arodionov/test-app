package com.example.testapp;

public class TestAppApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");

        AccountItem.StatusEnum active = AccountItem.StatusEnum.fromValue("ACTIVE");
        System.out.println(active);
        AccountItem.StatusEnum statusEnum = SomeClass.mapStatus(SomeClass.Account.Status.ACTIVE);
        System.out.println(statusEnum);
    }

}
