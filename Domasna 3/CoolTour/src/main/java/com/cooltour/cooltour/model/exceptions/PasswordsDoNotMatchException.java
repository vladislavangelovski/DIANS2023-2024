package com.cooltour.cooltour.model.exceptions;

public class PasswordsDoNotMatchException extends RuntimeException {

    public PasswordsDoNotMatchException() {
        super("Лозинките не се совпаѓаат");
    }
}

