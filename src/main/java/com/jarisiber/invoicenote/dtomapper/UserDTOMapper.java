package com.jarisiber.invoicenote.dtomapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.jarisiber.invoicenote.dto.UserDTO;
import com.jarisiber.invoicenote.domain.User;

/**
 * @author Jarisiber XSari13790
 * @version: 1.0
 * @since: 28/11/2023 - 10:22 AM
 */
@Component
public class UserDTOMapper {
    public static UserDTO fromUser(User user){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    public static User toUser(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }
}
