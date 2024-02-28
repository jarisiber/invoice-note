package com.jarisiber.invoicenote.repository;

import com.jarisiber.invoicenote.domain.User;

import java.util.Collection;

/**
 * @author Jarisiber XSari13790
 * @version: 1.0
 * @since: 27/02/2024 - 9:50 PM
 * +62 813 8522 9903
 */
public interface UserRepository <T extends User>{
    /* Basic CRUD operations */
    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    /* More complex operations */
}
