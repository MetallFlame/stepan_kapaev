package testing.library.exception;

public class WrongLoginException extends Exception {
    public WrongLoginException(String exceptionMessage){
        super(exceptionMessage);
    }
    WrongLoginException(){}
}
