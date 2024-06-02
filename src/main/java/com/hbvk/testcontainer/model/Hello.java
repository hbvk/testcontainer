package com.hbvk.testcontainer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Hello {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String message;

}
