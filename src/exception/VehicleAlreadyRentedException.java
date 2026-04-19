package exception;

public class VehicleAlreadyRentedException extends RuntimeException {
    public VehicleAlreadyRentedException(String message) {
        super(message);
    }
}
