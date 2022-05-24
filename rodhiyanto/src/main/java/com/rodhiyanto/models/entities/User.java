package com.rodhiyanto.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users",uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name" , length = 10)
    @NotNull
    @NotBlank
    private String name;

    @Column(name="address" , length= 30)
    @NotNull
    @NotBlank
    private String address;

    @Column(name="email")
    @NotNull
    @NotBlank
    @Email
    private String email;

    
    public User(Long id, @NotNull @NotBlank String name, @NotNull @NotBlank String address,
            @NotNull @NotBlank @Email String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
