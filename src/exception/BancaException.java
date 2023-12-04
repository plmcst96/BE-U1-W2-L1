package exception;

public class BancaException extends Exception{
    private final String message;

    public BancaException(String message) {
        super(message);
        this.message = message;
    }

}
