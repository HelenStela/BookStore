package ru.dz.labs.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dz.labs.api.domain.Cart;
import ru.dz.labs.api.domain.User;
import ru.dz.labs.api.repository.CartRepository;
import ru.dz.labs.api.repository.UsersRepository;

import java.util.List;

/**
 * Created by You on 14.01.2016.
 */
@Service
public class CartService {

    @Autowired
    private CartRepository cartsRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Transactional
    public void addCarts(Cart carts) {
        cartsRepository.add(carts);
    }

    @Transactional
    public Cart getCartsById(Long id) {
        return cartsRepository.getCartsById(id);
    }

    @Transactional
    public List<Cart> getCartsForUser(Long userId) {
        User user = usersRepository.getUserById(userId);
        return cartsRepository.getCartsForUser(user);
    }


}
