package com.example.AlabsTest;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;

public class User {
    private Long id;

    private Timestamp created_at;
    private Timestamp updated_at;
    private Date birthdate;

    private Short is_deleted;

    private String full_name;
    private String email;
    private String password;

    public User(Date birthdate, String full_name, String email, String password) {
        this.birthdate = birthdate;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Short getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Short is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
