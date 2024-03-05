package tn.esprit.gestionzoo.entitees;

public class ZooFullException extends Exception {
    public ZooFullException(String message) {
        super(message);
    }

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
}