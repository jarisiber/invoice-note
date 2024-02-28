package com.jarisiber.invoicenote.exception;

/**
 * @author Jarisiber
 * @version: 1.0
 * @since: 25/11/23 - 11:51 AM
 */
public class ApiException extends RuntimeException{
    public ApiException(String message) {
        super(message);
    }
}
