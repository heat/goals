package validations;

public class GoalsException extends Exception{

    public Integer code;
    public String message;

    public GoalsException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
