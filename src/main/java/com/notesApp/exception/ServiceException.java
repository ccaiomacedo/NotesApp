package com.notesApp.exception;

public class ServiceException extends Exception{

    private static final long serialVersionUID = 1l;

    public ServiceException(String msg){
        super(msg);
    }
}
