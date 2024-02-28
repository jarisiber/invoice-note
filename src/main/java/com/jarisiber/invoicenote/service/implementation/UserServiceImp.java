package com.jarisiber.invoicenote.service.implementation;

import com.jarisiber.invoicenote.domain.User;
import com.jarisiber.invoicenote.dto.UserDTO;
import com.jarisiber.invoicenote.dtomapper.UserDTOMapper;
import com.jarisiber.invoicenote.repository.UserRepository;
import com.jarisiber.invoicenote.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Jarisiber XSari13790
 * @version: 1.0
 * @since: 28/11/2023 - 11:18 AM
 */
@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {
    private final UserRepository<User> userUserRepository;
    @Override
    public UserDTO createUser(User user) {
        return UserDTOMapper.fromUser(userUserRepository.create(user));
    }
}
