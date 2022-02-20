package com.colby.languages.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity 
@Table(name = "languages") 
public class Language {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Validations
    @NotNull
    @Size(min = 2, max = 200, message = "Name must be 2-200 characters")
    private String name;
    @NotNull
    @Size(min = 3, max = 100, message = "Creator must be 3-100 characters")
    private String creator;
    @NotNull
    @Min(value = 1, message = "Must be minimum version 1")
    private double version;
    // This will not allow the createdAt column to be updated after creation
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    // Constructors

    public Language() {
    }

    //Getters and Setters

    //^^^^^^^^^^^^^^^^

    @PrePersist 
    protected void onCreate() {
        this.createdAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @PreUpdate 
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}