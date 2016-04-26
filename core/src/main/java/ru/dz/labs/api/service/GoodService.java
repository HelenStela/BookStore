package ru.dz.labs.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dz.labs.api.domain.Good;
import ru.dz.labs.api.repository.GoodsRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by You on 25.12.2015.
 */
@Service
public class GoodService {
    @Autowired
    private GoodsRepository goodsRepository;

    @Transactional
    public void add(Good goods) {
        goodsRepository.add(goods);
    }

    @Transactional
    public Good getGoodsById(Long id) {
        return goodsRepository.getGoodsById(id);
    }

    @Transactional
    public List<Good> getAllGoods() {
        return goodsRepository.getAllGoods();
    }
}


