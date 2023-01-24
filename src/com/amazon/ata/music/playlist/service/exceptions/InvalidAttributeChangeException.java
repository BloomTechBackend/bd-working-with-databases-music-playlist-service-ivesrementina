package com.amazon.ata.music.playlist.service.exceptions;

public class InvalidAttributeChangeException extends PlaylistNotFoundException {
    private static final long serialVersionUID = 7996427999571359877L;

    public InvalidAttributeChangeException() {
        super();
    }
    public InvalidAttributeChangeException(String message) {
        super(message);
    }
    public InvalidAttributeChangeException(Throwable cause) {
        super(cause);
    }
    public InvalidAttributeChangeException(String message, Throwable cause) {
        super(message, cause);
    }
}
