package com.Dominoes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class duplicatResourceException extends RuntimeException {

    public duplicatResourceException(String message) {
        super(message);
    }
}
