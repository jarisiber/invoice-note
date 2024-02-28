package com.jarisiber.invoicenote.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Jarisiber XSari13790
 * @version: 1.0
 * @since: 28/11/2023 - 10:15 AM
 */
@Data
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private String title;
    private String bio;
    private String imgUrl;
    private boolean enable;
    private boolean isNotLocked;
    private boolean isUsingMfa;
    private LocalDateTime createdAt;
}
