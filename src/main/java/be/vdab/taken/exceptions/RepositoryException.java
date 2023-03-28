package be.vdab.taken.exceptions;

public class RepositoryException extends RuntimeException{
    public RepositoryException(Exception oorzaak) {
        super(oorzaak);
    }
}
