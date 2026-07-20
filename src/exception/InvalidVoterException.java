package exception;

public class InvalidVoterException extends Exception{
    public InvalidVoterException(String message){
        super(message);                             //calls parent constructor
    }
}
