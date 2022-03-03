package com.colby.projectmanager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message="Username is required!")
    @Size(min=3, max=30, message="Username must be between 3 and 30 characters")
    private String userName;
    
    @NotEmpty(message="Email is required!")
    @Email(message="Please enter a valid email!")
    private String email;
    
    @NotEmpty(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
    private String password;
    
    @Transient
    @NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
    private String confirm;

    //___________Relationships_______________________
    
    //One user can lead many projects = 1:M
    @OneToMany(mappedBy = "projectLead", fetch = FetchType.LAZY)
    private List<Project> ledProjects;
    
   // one user can create many tasks 1:M
    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    private List<Task> tasks;
    
 // Many projects can have many teamMates M:M
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    		name = "users_projects",
    		joinColumns = @JoinColumn(name = "user_id"),
    		inverseJoinColumns = @JoinColumn(name = "project_id")
    		)
    private List<Project> projects;

//___________________Created at/Updated at_______________


	// This will not allow the createdAt column to be updated after creation
    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    public Long getId() {
		return id;
	}

    //Empty constructor
    public User() {}  
    
    //Methods
    @PrePersist 
    protected void onCreate() {
    	this.createdAt = new Date();
    }
    
    @PreUpdate 
    protected void onUpdate() {
    	this.updatedAt = new Date();
    }
    
    
//    Getters and Setters
    

	public String getUserName() {
		return userName;
	}

	public List<Project> getLedProjects() {
		return ledProjects;
	}

	public void setLedProjects(List<Project> ledProjects) {
		this.ledProjects = ledProjects;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setId(Long id) {
		this.id = id;
	}
 
    
    
    
}
