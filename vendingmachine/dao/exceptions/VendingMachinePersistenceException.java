package dao.exceptions;
/**
 * This class defines VendingMachinePersistenceException and the error message
 * @author yiy1156
 *
 */
public class VendingMachinePersistenceException extends Exception {
	
	private static final long serialVersionUID = 1L;
	/**
	 * Constructs a new VendingMachinePersistenceException given message
	 * @param message
	 */
	public VendingMachinePersistenceException(String message) {
        super(message);
    }
    /**
     * Constructs a new VendingMachinePersistenceException given message and cause
     * @param message
     * @param cause
     */
    public VendingMachinePersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
