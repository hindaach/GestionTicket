package com.project.ticket.exception.detail;

public class EmailAlreadyUsed extends RuntimeException {
    public EmailAlreadyUsed(String s) {
        super(s);
    }

}
