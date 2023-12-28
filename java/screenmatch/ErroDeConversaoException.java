package screenmatch;

public class ErroDeConversaoException extends RuntimeException {
    private String msg;

    public ErroDeConversaoException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
    
}
