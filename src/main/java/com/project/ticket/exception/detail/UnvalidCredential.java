package com.project.ticket.exception.detail;

public class UnvalidCredential extends RuntimeException {
    public UnvalidCredential(String message){
        super(message);
    }
}
