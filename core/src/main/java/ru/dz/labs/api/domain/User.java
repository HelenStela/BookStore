package ru.dz.labs.api.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;

@Entity
@Table(name = "Users")
public class User implements UserDetails {
    @Id
    @Column(name = "id")   //
    @GeneratedValue(strategy = GenerationType.AUTO)  //
    private Integer id;

    @Column(name = "surname", length = 20)
    String surname;

    @Column(name = "mail")
    String mail;

    /**
     * hash пароля пользователя
     */
    private String hashPassword;

    @Column(name = "avatar", length = 100)
    String avatar;

    @Column(name = "name", length = 100)
    String name;

    /**
     * Права доступа пользователя (возможные значения 'ROLE_USER', 'ROLE_ADMIN')
     */
    @Column
    private String role;

    /**
     * Уникальный ключ для подтверждения пользователя, отправляется по почте
     */
    private String key;

    /**
     * Флаг, что пользователь подтвержден и активен.
     */
    private Boolean enabled;

    private Integer phone;

    private Boolean signUp;


    public User() {
    }

    @OneToMany
    List<Order> orders;

    @OneToMany
    List<Cart> carts;

    @OneToMany
    List<Address> address;


    public User(String surname, String mail, String hashPassword, String name) {
        this.surname = surname;
        this.mail = mail;
        this.hashPassword = hashPassword;
        this.name = name;
    }

    public User(String surname, String mail, String hashPassword, String name, String role) {
        this.surname = surname;
        this.mail = mail;
        this.hashPassword = hashPassword;
        this.name = name;
        this.role = role;
    }

    public User(String surname, String mail, String hashPassword, String avatar, String name, String role, String key, Boolean enabled, List<Order> orders, List<Cart> carts, List<Address> address) {
        this.surname = surname;
        this.mail = mail;
        this.hashPassword = hashPassword;
        this.avatar = avatar;
        this.name = name;
        this.role = role;
        this.key = key;
        this.enabled = enabled;
        this.orders = orders;
        this.carts = carts;
        this.address = address;
    }

//    return firstName+","+lastName+","+email+","+phone+","+signIn+","+password;

    public User(String name, String surname, String email, String phone, String signIn, String hashPassword) {
        this.name = name;
        this.surname = surname;
        this.mail = email;
        try {
            this.phone = Integer.parseInt(phone);
        } catch (NumberFormatException e) {
        }
        this.signUp = Boolean.valueOf(signIn);
        this.hashPassword = hashPassword;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return hashPassword;
    }

    @Override
    public String getUsername() {
        return mail;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Boolean getSignUp() {
        return signUp;
    }

    public void setSignUp(Boolean signUp) {
        this.signUp = signUp;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}
