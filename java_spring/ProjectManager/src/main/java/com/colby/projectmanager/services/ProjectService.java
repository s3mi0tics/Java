package com.colby.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.colby.projectmanager.models.Project;
import com.colby.projectmanager.models.Task;
import com.colby.projectmanager.models.User;
import com.colby.projectmanager.repositories.ProjectRepository;
import com.colby.projectmanager.repositories.TaskRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private TaskRepository taskRepository;
	

    //___________Read All_______________
    public List<Project> allProjects() {
        return projectRepository.findAll();
    }
    
    
    //__________Create__________________
    public Project createProject(Project p, BindingResult result) {
        // Reject if title is taken (present in database)
        Optional<Project> potentialProject = projectRepository.findByTitle(p.getTitle());
        if(potentialProject.isPresent()){
            result.rejectValue("title", "matches", "This title is taken");
        }
     // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
        return projectRepository.save(s);
    }
    
    
    //__________Read One______________
    public Project findProject(Long id) {
        Optional<Project> optionalProject = projectRepository.findById(id);
        if(optionalProject.isPresent()) {
            return optionalProject.get();
        } else {
            return null;
        }
    }
   
    
    // Read all that user had not joined
   public List<Project> unjoinedProjects(User user){
	   return projectRepository.findByUsersNotContaining(user)
   }
    
   
    //___________Update One_______________
    public Project updateProject(Project p,  BindingResult result) {
        return projectRepository.save(p);
    }


    //__________Deletes a Project and all of its tasks______________
    public void deleteProject(Project project) {
    	for(Task task : project.getTasks()) {
    		taskRepository.delete(task);
    	}
    	projectRepository.delete(project);
    }
}
