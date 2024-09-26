package apigestaousuarios.demo.exception;

public class UserBusinessException extends RuntimeException{
    private static final long servialVersionUID = 1L;
    public UserBusinessException(String message){
        super(message);
    }
    public UserBusinessException(Throwable cause) {
        super(cause);
    }
    public UserBusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}