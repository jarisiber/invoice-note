package com.jarisiber.invoicenote.resource;

import com.jarisiber.invoicenote.domain.HttpResponse;
import com.jarisiber.invoicenote.domain.User;
import com.jarisiber.invoicenote.dto.UserDTO;
import com.jarisiber.invoicenote.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;

/**
 * @author Jarisiber XSari13790
 * @version: 1.0
 * @since: 28/11/2023 - 1:32 PM
 */
@RestController
@RequestMapping(path ="/user")
@RequiredArgsConstructor
public class UserResource {
    // dependence injection
    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<HttpResponse> saveUser(@RequestBody @Valid User user){
        UserDTO userDto = userService.createUser(user);
        return ResponseEntity.created(getUri()).body(
                HttpResponse.builder()
                        .timeStamp(now().toString())
                        .data(of("user", userDto))
                        .message("User Created")
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .build());
    }

    private URI getUri() {
        return URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/user/get/<userId>").toUriString());
    }
}
