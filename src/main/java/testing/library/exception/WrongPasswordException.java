package testing.library.exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String exceptionMessage){
        super(exceptionMessage);
    }
}
