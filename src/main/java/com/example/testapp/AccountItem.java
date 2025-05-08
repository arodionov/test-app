package com.example.testapp;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public class AccountItem {

    public enum StatusEnum {
        ACTIVE("ACTIVE"),

        BLOCKED("BLOCKED"),

        CLOSED("CLOSED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value))
                    return b;

            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
}
