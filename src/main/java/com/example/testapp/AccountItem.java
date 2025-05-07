package com.example.testapp;

public class AccountItem {

    public enum StatusEnum {
        ACTIVE("ACTIVE"),

        BLOCKED("BLOCKED"),

        CLOSED("CLOSED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value))
                    return b;

            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
}
