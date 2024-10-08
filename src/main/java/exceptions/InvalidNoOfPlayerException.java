package exceptions;

public class InvalidNoOfPlayerException extends RuntimeException {

    public InvalidNoOfPlayerException(String message) {
        super(message);
    }

    public InvalidNoOfPlayerException() {
    }
}
