package com.cooltour.cooltour.model.exceptions;

public class UsernameAlreadyExistsException extends RuntimeException{

    public UsernameAlreadyExistsException(String username) {
        super(String.format("Корисникот со корисничко име: %s веќе постои", username));
    }
}

