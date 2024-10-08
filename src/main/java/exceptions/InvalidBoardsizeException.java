package exceptions;

public class InvalidBoardsizeException extends RuntimeException {

    public InvalidBoardsizeException() {
    }

    public InvalidBoardsizeException(String message) {
            super(message);
    }
}
