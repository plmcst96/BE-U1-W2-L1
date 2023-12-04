package exception;

public class BancaException extends Exception{
    private final String message;

    public BancaException(String message, String message1) {
        super(message);
        this.message = message1;
    }

}
