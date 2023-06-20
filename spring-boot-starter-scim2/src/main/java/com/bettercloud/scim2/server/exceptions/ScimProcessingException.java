package com.bettercloud.scim2.server.exceptions;

public class ScimProcessingException extends RuntimeException {
    public ScimProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
