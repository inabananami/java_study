//RuntimeExceptionの継承は必要となる
public class AgeIllgalRuntimeException extends RuntimeException {
    public AgeIllgalRuntimeException() {
        super();
    }

    public AgeIllgalRuntimeException(String message) {
        super(message);
    }
}
