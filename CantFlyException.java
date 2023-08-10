public class CantFlyException extends RuntimeException {

    public CantFlyException() {
        super();
    }

    public CantFlyException(String ex) {
        super(ex);
        System.out.println(ex);
    }

    public CantFlyException(String ex, Throwable e) {
        super(ex, e);
        System.out.println(ex);
    }
    
}
