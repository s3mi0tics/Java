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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 3, max = 200, message = "Title is required")
    private String title;
    
    
    @NotNull
    @Size(min = 3, max = 4000, message = "Description cannot be blank")
    private String description;
    
    @Future(message= "Can not have an expired due date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;
    
    
//___________Relationships______________
    
    //Many projects can have one lead = M:1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="lead_id")
    private User projectLead;
    
//   one project can have many tasks 1:M  
    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private List<Task>  tasks;
    
// Many projects can have many teamMates M:M
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    		name = "users_projects",
    		joinColumns = @JoinColumn(name = "project_id"),
    		inverseJoinColumns = @JoinColumn(name = "user_id")
    		)
    private List<User> users;
    
    
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

//    getters and setters
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public User getProjectLead() {
		return projectLead;
	}

	public void setProjectLead(User projectLead) {
		this.projectLead = projectLead;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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
    
