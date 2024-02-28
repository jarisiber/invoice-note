package com.jarisiber.invoicenote.repository;

import com.jarisiber.invoicenote.domain.Role;

import java.util.Collection;

/**
 * @author Jarisiber
 * @version: 1.0
 * @since: 25/11/23 - 12:47 PM
 */
public interface RoleRepository<T extends Role>{
    /* Basic CRUD operations */
    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    /* More complex operations */
    void addRoleToUser(Long userId, String roleName);
    Role getRoleByUserId(long userId);
    Role getRoleByUserEmail (String email);
    void updateUserRoleId(Long userId, String roleName);
}