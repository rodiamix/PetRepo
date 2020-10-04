package org.pet.service;

import org.pet.entity.User;

public interface UserService {

    void save (User user);

    User findByUsername(String username);

}
