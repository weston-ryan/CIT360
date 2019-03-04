/*
 * Ryan Weston
 * CIT 360 - JSON example.
 */
package json.java;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;
import json.java.JSONJava;
import json.java.JSONJava;
import json.java.ObjectMapper;       

/**
 *
 * I'm keeping this very simple, because it was hard for me to grasp the idea
 * let alone put it into something that works.
 */
public class JSONJava {

    /**
     * JSON = JavaScript Object Notation
     *
     * @param args
     */
    public static void main(String[] args) {
        JSONJava obj = new JSONJava();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        //create a new object called Facebook
        Facebook facebook = createObject();

        try {

            // an array in ordered sequence of values.  
            System.out.println("Regular View");
            String regularView = mapper.writeValueAsString(facebook);
            System.out.println(regularView);

            //convert text into an object:
            String jsonInString = "{\"name\":\"Ryan Weston\",\"age\":41,\"status\":\"Student\",\"scholarship\":9250,\"profile\":[\"Picture\"]}";
            Facebook normalFacebook = mapper.readValue(jsonInString);
            System.out.println(normalFacebook);

            // Display everything
            System.out.println("\nEverything View");
            String displayEverythingView = mapper.writeValueAsString(facebook);
            System.out.println(displayEverythingView);

            Facebook EverythingFacebook = mapper.readValue(jsonInString, Facebook.class);
            System.out.println(EverythingFacebook);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // insert objects or actual data into the application
    //send data as an object...
    // I need name, age, status, scholarship, and profile attributes, along with getters and setters.
    private Facebook createObject() {

        Facebook facebook = new Facebook();

        List<String> profile = new ArrayList<>();
        profile.add("Picture");

        facebook.setProfile(profile);

        return facebook;
//create a facebook class

    public class Facebook {
        private String facebook;
        public String getName(){
            String Name = null;
            return Name;
        }
        public void setName("Ryan Weston"){
            this.name = newName;
        }
        public String getAge(){
            String Age = null;
            return Age;}
        public void setAge("41"){
            this.Age = newAge;
        }
        public void getStatus(){
            return Status;
        }
        public String setStatus("Student"){
            this.Student = newstudent;
        }
        public void getScholarship(){
            return Scholarship;
        }
        public String setScholarship(new BigDecimal("9250")){
            this.Scholarship = newScholarship;
        }

        private void setProfile(List<String> profile) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
        
    }

        private void setName(String ryan_Weston) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setAge(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setStatus(String student) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setScholarship(BigDecimal bigDecimal) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setProfile(List<String> profile) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
