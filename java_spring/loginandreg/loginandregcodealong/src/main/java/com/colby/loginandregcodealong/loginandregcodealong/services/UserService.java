package com.colby.loginandregcodealong.loginandregcodealong.services;

import java.util.Optional;

import com.colby.loginandregcodealong.loginandregcodealong.models.LoginUser;
import com.colby.loginandregcodealong.loginandregcodealong.models.User;
import com.colby.loginandregcodealong.loginandregcodealong.repositories.UserRepository;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    //___________________REGISTER_________________________

    public User register(User newUser, BindingResult result) {
        
        // Reject if email is taken (present in database)
        Optional<User> potentialUser = userRepository.findByEmail(newUser.getEmail());
        if(potentialUser.isPresent()){
            result.rejectValue("email", "regEmailMatches", "This email is taken");
        }
        
        // Reject if password doesn't match confirmation
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("confirm", "matches", "Password and confirm password must match");
        }
        // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
        // Hash and set password, save user to database
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        //Save user to the database
        return userRepository.save(newUser);
    }

    //____________________Login______________________________

    public User login(LoginUser newLoginUser, BindingResult result) {
    	if(result.hasErrors()){
            return null;
        }
        // Find user in the DB by email
        Optional<User> potentialUser = userRepository.findByEmail(newLoginUser.getEmail());
        // Reject if NOT present
        if(!potentialUser.isPresent()){
            result.rejectValue("loginEmail", "existingemail", "Unknown email");
            return null;
        }
        // Reject if BCrypt password match fails
        User user = potentialUser.get();
        if(!BCrypt.checkpw(newLoginUser.getPassword(), user.getPassword())){
            result.rejectValue("password", "matchesBCrypt", "Invalid password");
        }
        // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
        // Otherwise, return the user object
        else{
            return user;
        }
    }
    //CRUD
    //Read one
    public User findOne(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()){
            return optionalUser.get();
        }else{
            return null;
        }
    }
}
