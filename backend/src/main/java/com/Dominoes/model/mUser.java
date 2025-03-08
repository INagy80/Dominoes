package com.Dominoes.model;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
public class mUser {

    //atribute

    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"

    )
    private Integer id;



    private String username;

    private String password;

    private String email;

    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    private profile profile;


    @OneToOne(cascade = CascadeType.ALL)
    private address address;


    public mUser(String username, String password, String email, String phone, com.Dominoes.model.profile profile, com.Dominoes.model.address address) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.profile = profile;
        this.address = address;
    }

    public mUser() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public com.Dominoes.model.profile getProfile() {
        return profile;
    }

    public void setProfile(com.Dominoes.model.profile profile) {
        this.profile = profile;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        mUser mUser = (mUser) o;
        return Objects.equals(id, mUser.id) && Objects.equals(username, mUser.username) && Objects.equals(password, mUser.password) && Objects.equals(email, mUser.email) && Objects.equals(phone, mUser.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, email, phone);
    }

    @Override
    public String toString() {
        return "mUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", profile=" + profile +
                ", address=" + address +
                '}';
    }
}
