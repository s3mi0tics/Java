package com.colby.projectmanager.models;

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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="tasks")
public class Task {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 4000, message = "Description cannot be blank")
    private String description;
    
  //___________Relationships______________
    
//  many tasks can have one project M:1 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tasks")
    private Project project;
    
//  many tasks can be created by one user
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tasks")
    private User creator;

  //___________________Created at/Updated at_______________

    
  	// This will not allow the createdAt column to be updated after creation
      @Column(updatable=false)
      @DateTimeFormat(pattern="yyyy-MM-dd")
      private Date createdAt;
      @DateTimeFormat(pattern="yyyy-MM-dd")
      private Date updatedAt;
      
      //____________Empty constructor___________
      public Task() {}

      //______________Methods______________
      @PrePersist
      protected void onCreate(){
          this.createdAt = new Date();
      }
      @PreUpdate
      protected void onUpdate(){
          this.updatedAt = new Date();
      }
      
//      getters and setters
      

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
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
      
      
}

