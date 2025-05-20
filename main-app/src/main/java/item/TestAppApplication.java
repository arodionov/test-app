package item;

import gen.AccountItem;
import gen.AccountItem2;

public class TestAppApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");

        AccountItem.StatusEnum active = AccountItem.StatusEnum.fromValue("ACTIVE");
        System.out.println(active);
        AccountItem.StatusEnum statusEnum = SomeClass.mapStatus(SomeClass.Account.Status.ACTIVE);
        System.out.println(statusEnum);
        AccountItem2.StatusEnum statusEnum2 = SomeClass2.mapStatus(SomeClass2.Account.Status.BLOCKED);
        System.out.println(statusEnum2);
    }

}
