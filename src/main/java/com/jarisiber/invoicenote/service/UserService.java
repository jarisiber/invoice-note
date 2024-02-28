package com.jarisiber.invoicenote.service;

import com.jarisiber.invoicenote.domain.User;
import com.jarisiber.invoicenote.dto.UserDTO;

/**
 * @author Jarisiber XSari13790
 * @version: 1.0
 * @since: 28/11/2023 - 10:09 AM
 */
public interface UserService {
    UserDTO createUser(User user);
}
