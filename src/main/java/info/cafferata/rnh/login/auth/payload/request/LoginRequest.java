package login.auth.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter // Getters generated by Lombok
@Setter // Setters generated by Lombok
public class LoginRequest {

    @NotBlank // Username is mandatory to login
    private String username;

    @NotBlank // Password is mandatory to login
    private String password;
}
