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
import com.fasterxml.jackson.databind.ObjectMapper;       

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
            Facebook normalFacebook = mapper.readValue(jsonInString, Facebook.class);
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
        facebook.setName("Ryan Weston");
        facebook.setAge(41);
        facebook.setStatus("Student");
        facebook.setScholarship(new BigDecimal(val:"9250"));
        List<String> profile = new ArrayList<>();
        profile.add("Picture");

        facebook.setProfile(profile);

        return facebook;
    }
//create a facebook class

    public class Facebook {
        private String name;
        private int age;
        private String status;
        private BigDecimal scholarship;
        private List<String> profile;
        
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        public String getStatus(){
            return status;
        }
        public void setStatus(String status){
            this.status = status;
        }
        public BigDecimal getScholarship(){
            return scholarship;
        }
        public void setScholarship(BigDecimal scholarship){
            this.scholarship = scholarship;
        }
        public List<String> getProfile(){
            return profile;
        }
        private void setProfile(List<String> profile) {
            this.profile = profile;
        }
    }
        
    }
