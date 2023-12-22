package com.cooltour.cooltour.service.impl;

import com.cooltour.cooltour.model.User;
import com.cooltour.cooltour.model.exceptions.InvalidArgumentsException;
import com.cooltour.cooltour.model.exceptions.InvalidUserCredentialsException;
import com.cooltour.cooltour.model.exceptions.PasswordsDoNotMatchException;
import com.cooltour.cooltour.model.exceptions.UsernameAlreadyExistsException;
import com.cooltour.cooltour.repository.UserRepository;
import com.cooltour.cooltour.service.AuthService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new InvalidArgumentsException();
        }

        return userRepository.findUserByUsernameAndPassword(username, password)
                .orElseThrow(InvalidUserCredentialsException::new);
    }
    @Override
    public User register(String username, String password, String repeatPassword, String name, String surname, String email) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty() || name.isEmpty()
                || surname.isEmpty()  || email.isEmpty()) {
            throw new InvalidArgumentsException();
        }

        if (!password.equals(repeatPassword)) {
            throw new PasswordsDoNotMatchException();
        }

        if(this.userRepository.findUserByUsername(username).isPresent()) {
            throw new UsernameAlreadyExistsException(username);
        }

        User user = new User(
                username,
                password,
                name,
                surname,
                email
        );
        return userRepository.save(user);

    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
