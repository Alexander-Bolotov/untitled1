package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    int SAVE_SUCCESS = 0;
    int ERROR_SAVE_USERNAME_TAKEN = 1;
    int ERROR_SAVE_PASSWORDS_DONT_MATCH = 2;
    int save(User user);
    User getById(long id);
    List<User> getAllUsers();
    boolean deleteById(long id);
    User getUserByUsername(String username);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
