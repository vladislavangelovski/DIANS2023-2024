package com.cooltour.cooltour.model.exceptions;

public class InvalidUserCredentialsException extends RuntimeException {

    public InvalidUserCredentialsException() {
        super("Внесовте погрешни информации");
    }
}
