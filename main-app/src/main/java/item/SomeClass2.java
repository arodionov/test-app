package item;

import gen.AccountItem2;

public class SomeClass2 {

    static AccountItem2.StatusEnum mapStatus(Account.Status status) {
        return (status == null) ? null : switch(status) {
            case ACTIVE -> AccountItem2.StatusEnum.ACTIVE;
            case BLOCKED -> AccountItem2.StatusEnum.BLOCKED;
            case CLOSED -> AccountItem2.StatusEnum.CLOSED;
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
