package com.notesApp.exception;

public class CriptoExistException extends Exception {
    private static final long serialVersionUID = 1l;

    public CriptoExistException(String msg){
        super(msg);
    }
}
