package ru.dz.labs.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.dz.labs.api.domain.User;
import ru.dz.labs.api.service.UserService;

@Component
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    public UserService userService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userService.getUserByLogin(login);
        if (user == null) throw new UsernameNotFoundException("User with name " + login + " not found");
        return new MyUserDetail(user);
    }

}
