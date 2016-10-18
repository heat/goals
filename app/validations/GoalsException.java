package validations;

public class GoalsException extends Exception{

    public Integer code;
    public String message;

    public GoalsException(String message, Integer code) {
        super(message);
        this.code = code;
    }
}
