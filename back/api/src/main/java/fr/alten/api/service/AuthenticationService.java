package fr.alten.api.service;

import fr.alten.api.dto.LoginUserDto;
import fr.alten.api.dto.RegisterUserDto;
import fr.alten.api.model.Account;
import fr.alten.api.repository.AccountRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final AccountRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;

    public AuthenticationService(
            AccountRepository userRepository,
            AuthenticationManager authenticationManager,
            PasswordEncoder passwordEncoder
    ) {
        this.authenticationManager = authenticationManager;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Account signup(RegisterUserDto input) {
        Account user = new Account(input.getUsername(),input.getFirstName(),input.getEmail(),input.getPassword());

        return userRepository.save(user);
    }

    public Account authenticate(LoginUserDto input) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        input.getEmail(),
                        input.getPassword()
                )
        );

        return AccountRepository.findByEmail(input.getEmail())
                .orElseThrow();
    }
}