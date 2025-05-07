package com.example.testapp;

public class SomeClass {

    static AccountItem.StatusEnum mapStatus(Account.Status status) {
        return (status == null) ? null : switch(status) {
            case ACTIVE -> AccountItem.StatusEnum.ACTIVE;
            case BLOCKED -> AccountItem.StatusEnum.BLOCKED;
            case CLOSED -> AccountItem.StatusEnum.CLOSED;
            default -> null;
        };
    }

    class Account {
        enum Status {
            ACTIVE,
            BLOCKED,
            CLOSED,
            UNKNOWN
        }
    }
}
