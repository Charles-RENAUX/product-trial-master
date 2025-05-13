package fr.alten.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthentificationController {
    private final JwtService jwtService;

    private final AuthenticationService authenticationService;
}
