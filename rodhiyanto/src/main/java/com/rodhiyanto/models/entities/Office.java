package com.rodhiyanto.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "offices",uniqueConstraints={@UniqueConstraint(columnNames={"officeid"})})
public class Office implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="officeid" , length = 10)
    private Double officeid;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Office(Long id, Double officeid) {
        this.id = id;
        this.officeid = officeid;
    }

    public Double getOfficeid() {
        return officeid;
    }

    public void setOfficeid(Double officeid) {
        this.officeid = officeid;
    }

   
    

   
}
