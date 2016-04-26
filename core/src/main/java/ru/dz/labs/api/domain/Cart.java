package ru.dz.labs.api.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @Column(name = "id")   // обозначает имя колонки, соотвtтствующей данному полю
    @GeneratedValue(strategy = GenerationType.AUTO)  // определяет способ генерации
    private Integer id;

    @Column(name = "count")
    Integer count;

    @ManyToOne
    Good good;

    @ManyToOne
    User user;

    Long userId;

    Long goodId;

    public Cart() {
    }

    public Cart(Integer count, User user, Good good) {
        this.count = count;
        this.user = user;
        this.good = good;
    }

    public Cart(Integer count, Good good) {
        this.count = count;
        this.good = good;

    }

    ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
