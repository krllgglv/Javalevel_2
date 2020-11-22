package exception;

public class MyArrayRuntimeException extends RuntimeException {
    public MyArrayRuntimeException() {
    }

    public MyArrayRuntimeException(String message) {
        super(message);
    }

    public MyArrayRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
