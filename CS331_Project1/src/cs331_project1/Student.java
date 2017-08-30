/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs331_project1;

/**
 *
 * @author briancwillis
 */
public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    
    // Constructor: Sets up this student with the specified values.
    public Student (String first, String last, Address home, Address school){
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
    }


public String toString(){
  String result = "";
        result = firstName + " " + lastName + "\n";
        result += "Home Address: \n" + homeAddress +  "\n";
        result += "School address: \n" + schoolAddress;
        return result;
 }
}

}
