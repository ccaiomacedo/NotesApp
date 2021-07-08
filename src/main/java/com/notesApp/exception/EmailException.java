package com.notesApp.exception;

public class EmailException extends Exception{
    private static final long serialVersionUID = 1l;

    public EmailException(String msg){
        super(msg);
    }
}
