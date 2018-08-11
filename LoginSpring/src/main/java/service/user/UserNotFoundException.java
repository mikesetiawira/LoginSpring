package service.user;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userName){
        super("Username "+ userName+ " tidak ditemukan");
    }
}
