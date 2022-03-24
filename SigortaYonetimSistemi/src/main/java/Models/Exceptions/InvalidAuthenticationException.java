package Models.Exceptions;

public class InvalidAuthenticationException extends Exception{
    public InvalidAuthenticationException() {
    }

    public InvalidAuthenticationException(String message) {
        super(message);
    }
}
