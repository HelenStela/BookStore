package ru.dz.labs.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dz.labs.api.domain.User;
import ru.dz.labs.api.repository.UsersRepository;

import javax.transaction.Transactional;

/**
 * Created by You on 25.12.2015.
 */
@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Transactional
    public void add(User user) {
        usersRepository.add(user);
    }

    @Transactional
    public User checkUser(String email, String hashPass) {
        return usersRepository.getUserByEmailAndPass(email, hashPass);
    }

    public User getUserByLogin(String login) {
        return usersRepository.getUserByLogin(login);
    }

}


