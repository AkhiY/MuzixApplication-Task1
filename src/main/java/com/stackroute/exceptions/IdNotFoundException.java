package com.stackroute.exceptions;

public class IdNotFoundException extends Exception {
    private String message;
    public IdNotFoundException()
    {

    }
    public IdNotFoundException(String message)
    {
        super(message);
        this.message=message;
    }
}