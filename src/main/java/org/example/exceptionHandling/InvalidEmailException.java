package org.example.exceptionHandling;

public class InvalidEmailException extends RuntimeException{

    public InvalidEmailException(String message){
        super(message);
    }


}
