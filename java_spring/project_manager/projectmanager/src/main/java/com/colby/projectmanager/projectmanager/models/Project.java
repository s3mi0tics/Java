package com.colby.projectmanager.projectmanager.models;

import javax.validation.constraints.Future;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 5, max = 200, message = "Title is required")
    private String title; 
    
    @NotNull
    @Size(min = 3, max = 4000, message = "Description cannot be blank")
    private String description;

    @Future (message = "Date must be in the future")
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date dueDate;
    
    //___________Relationships______________

    //One project can have many teamMembers = 1:M

    //Many projects can have one teamLeader = M:1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    
    //Many books can have one borrower = M:1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="borrower")
    private User borrower; 
    
//___________________Created at/Updated at_______________

    // This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    //____________Empty constructor___________
    public Project() {}

    //______________Methods______________
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();


    }
}
