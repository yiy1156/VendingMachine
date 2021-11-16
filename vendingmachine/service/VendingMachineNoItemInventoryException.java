package service;
/**
 * This class defines the VendingMachineNoItemInventoryException
 * and the error message
 * @author yiy1156
 *
 */
public class VendingMachineNoItemInventoryException extends Exception {
    
	private static final long serialVersionUID = 1L;
	/**
	 * Constructs a new VendingMachineNoItemInventoryException given message
	 * @param message
	 */
	public VendingMachineNoItemInventoryException(String message) {
        super(message);
    }
	/**
	 * Constructs a new VendingMachineNoItemInventoryException given message and cause
	 * @param message
	 * @param cause
	 */
    public VendingMachineNoItemInventoryException(String message,
            Throwable cause) {
        super(message, cause);
    }
}
