package fr.alten.api.dto;

public class RegisterUserDto {
    private String email;

    private String password;

    private String firstName;
    private String username;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }
}