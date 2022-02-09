CareSoft Interfaces
You’ve joined a team of developers that has built the software for a healthcare clinic management system called CareSoft. The codebase is already fully developed, but they are working on standardizing some of their business logic to streamline reporting requirements for the Healthcare Insurance Portability and Accountability Act (HIPAA) and maintain the security of electronic Personal Health Information (PHI or ePHI).

Objectives:
Become more comfortable using Spring Tool Suite (STS) tools
Practice using packages and become more familiar with reverse domain name convention
Review examples of how multiple classes may interact in a practical business scenario.
Recognize classes and class interactions without explicitly knowing how each class is implemented
Become more comfortable analyzing and contributing to a codebase with unfamiliar elements.
Implement existing interfaces in existing classes
Understand how interfaces and implementing interfaces differs from inheritance and extending another class.

New Interfaces
Related to feature requests from the business, two interfaces have been added to the application, and they have asked you to start implementing them in the appropriate classes (also provided):

HIPAACompliantUser
HIPAACompliantAdmin
Assignment
Your task is to implement two given interfaces, HIPAACompliantUser and  HIPAACompliantAdmin as described in two given classes, Physician and AdminUser.

Think a Lot, Code Very Little
For this assignment, you will be copying and pasting from the code in this lesson to get familiar with creating files, classes and interfaces in STS. You will also need to add constructors and getters & setters where needed. Ultimately you won't do too much coding in the assignment, but you will take some time to do quite a bit of analyzing. 

A common joke among developers:

"Weeks of coding can save you hours of planning."
It's good to get into the habit early on of taking the steps to really understand the problem and existing code base, lay out possible solutions and plan implementation thoroughly before ever writing a line of code.

Set up
Create a new Java project in STS and a package in your src folder with the reverse domain name: com.caresoft.clinicapp 
Next, in STS, in the package you just created, make a new interface called HIPAACompliantUser, empty for now.
Then in that same package, create the HIPAACompliantAdmin interface, also empty for now.
Create the following 3 classes, empty for now, that will implement these new interfaces.
User  - None. (Leave as is, no implementations)
Physician  - Will implement  HIPAACompliantUser and extend User
AdminUser - Will implement both  HIPAACompliantUser and HIPAACompliantAdmin and extend User
Tip: Try using STS to inherit and extend when you make your classes! It will autogenerate some code for you. You can also auto-generate getters, setters and constructors by going to the "Source" menu. Yay STS! 

Copy and paste the given code for each interface below.
Copy and paste the code examples for each class file, but keep the method stubs created by STS. 
Follow the guidelines for writing the implemented methods in your classes.
Created a Test file and use the testing code provided to test all your implementations.
Remember the 20-minute rule! Don't stay stuck if you're unclear on anything.

HIPAACompliantUser Interface
The complete code to put inside the HIPAACompliantUser interface is given (below), and does not need to be altered.

public interface HIPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}copy
HIPAACompliantAdmin Interface
HIPAACompliantAdmin interface is also given, and does not need to be altered.

Tip: To auto-import any dependencies in STS, use shift + cmd + O for Mac or  shift + ctrl + O for Windows.

import java.util.ArrayList;
public interface HIPAACompliantAdmin {
    
    abstract ArrayList<String> reportSecurityIncidents();
    
    // DEFAULT IMPLEMENTED METHODS
    // Used to print security incidents. 
    public default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    // QA Test, PASS/FAIL of reports against QA expected results
    public default boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
    
}copy
User.java

All you'll need to add to the User class is getters and setters and a constructor.

public class User {
    protected Integer id;
    protected int pin;
    
    // TO DO: Getters and setters
	// Implement a constructor that takes an ID
}copy
Your Task: Implement Some Interfaces!
The codebase you are given includes two files that you'll be working in: PhysicianandAdminUser. You'll be adding code for the methods each class should implement from a respective interface.

Physician
The  Physician class implements the HIPAACompliantUser interface in the following ways:

boolean assignPIN(int)	Pin must be exactly 4 digits, returns false if not.
Expected to assign the pin to the user (as a member variable)
boolean accessAuthorized(Integer)	Checks the physician's id against the given id;
returns true if they are a match, otherwise false.
Physician.java

//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getterscopy
AdminUser
The AdminUser class implements the HIPAACompliantUser interface in the following ways:

boolean assignPIN(int)	Pin must be 6 digits or more; returns false if not
Expected to assign the pin to the user (as a member variable)
boolean accessAuthorized(Integer)	Compares the ids, and if they are not a match,
creates an incident report using the  authIncident method,
Returns true if ids match, false if not.
The AdminUser class implements the HIPAACompliantAdmin interface in the following ways:

ArrayList<String> reportSecurityIncidents()	Returns a list of strings (incidents reported)
AdminUser.java

//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Setters & Getterscopy
Test.java

// .. Main method set up ... //
        Physician doctor10 = new Physician(1);
        AdminUser roseTyler = new AdminUser(2, "Companion");
        AdminUser donnaNoble = new AdminUser(3, "Companion");
        
        
        // Physician Implementation Tests
        System.out.println("\n==</span>======== Physician Tests ==========\n");
        String pinTest1 = doctor10.assignPin(42)? "FAIL" : "PASS";
        System.out.printf("Physician pin assign test 1: %s\n", pinTest1);
        
        String pinTest2 = doctor10.assignPin(4000)? "PASS" : "FAIL";
        System.out.printf("Physician pin assign test 2: %s\n", pinTest2);
        
        String authTest1 = doctor10.accessAuthorized(1234)? "FAIL" : "PASS";
        System.out.printf("Physician auth test 1: %s\n", authTest1);
        
        String authTest2 = doctor10.accessAuthorized(1)? "PASS" : "FAIL";
        System.out.printf("Physician auth test 2: %s\n", authTest2);
        
        // AdminUser Implementation Tests
        System.out.println("\n========== AdminUser Tests ==========\n");
        String pinTest3 = roseTyler.assignPin(42)? "FAIL" : "PASS";
        System.out.printf("Admin pin assign test 1: %s\n", pinTest3);
        
        String pinTest4 = roseTyler.assignPin(424242)? "PASS" : "FAIL";
        System.out.printf("Admin pin assign test 2: %s\n", pinTest4);
        
        String authTest3 = roseTyler.accessAuthorized(1234)? "FAIL" : "PASS";
        System.out.printf("Admin auth test 1: %s\n", authTest3);
        
        String authTest4 = roseTyler.accessAuthorized(1234)? "FAIL" : "PASS";
        System.out.printf("Admin auth test 1: %s\n", authTest4);
        
        String authTest5 = roseTyler.accessAuthorized(2)? "PASS" : "FAIL";
        System.out.printf("Admin auth test 2: %s\n\n", authTest5);
        
        donnaNoble.accessAuthorized(42);
        donnaNoble.accessAuthorized(4321);
        donnaNoble.accessAuthorized(7);
        donnaNoble.accessAuthorized(28);
        
        System.out.println(donnaNoble.reportSecurityIncidents());copy
Your test results should look like the following:




Reminder: Ask Questions!
In your first role as an engineer, this kind of task is fairly typical of junior developers. These two classes would have many more methods, member variables and imports that would be unrelated to your task, and they would be part of a much larger code base. Sometimes they will give you enough background information to accomplish the task, but if not, it's okay to ask questions, after you feel you've done some digging to figure it out and don't find much to go on. For this assignment, be sure to follow that 20 minute rule, and be sure to ask if it's unclear or you hit a dead end!

Create all the necessary interfaces and classes

Auto-generated constructors, setters and getters using STS, and implement as necessary.

In the Physician class, implement the assignPin(int) method.

In the Physician class, implement the accessAuthorized(Integer) method.

In the AdminUser class, implement the assignPin(int) method.

In the AdminUser class, implement the accessAuthorized(Integer) method.

In the AdminUser class, implement the ArrayList reportSecurityIncidents() method.

Test and debug till all the test cases pass.