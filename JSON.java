/*
 * Ryan Weston
 * CIT 360 - JSON example.
 */
package json.java;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
        JSONExample obj = new JSONExample();
        obj.run();
    }

    private void run() {
        ObjectMapper mapper = new ObjectMapper();

        //create a new object called Facebook
        Facebook facebook = createObject();

        try {

            // an array in ordered sequence of values.  
            System.out.println("Regular View");
            String regularView = mapper.writerWithView(Views.Normal.class).writeValueAsString(facebook);
            System.out.println(regularView);

            //convert text into an object:
            String jsonInString = "{\"name\":\"Ryan Weston\",\"age\":41,\"status\":\"Student\",\"scholarship\":9250,\"profile\":[\"Picture\"]}";
            Facebook normalFacebook = mapper.readerWithView(Views.Normal.class).forType(Facebook.class).readValue(jsonInString);
            System.out.println(normalFacebook);

            // Display everything
            System.out.println("\nEverything View");
            String displayEverythingView = mapper.writerWithView(Views.Everything.class).writeValueAsString(facebook);
            System.out.println(displayEverythingView);

            Facebook EverythingFacebook = mapper.readerWithView(Views.Everything.class).forType(Facebook.class).readValue(jsonInString);
            System.out.println(EverythingFacebook);

        } catch (JsonGenerationException | IOException e) {
        }
    }

    // insert objects or actual data into the application
    //send data as an object...
    private Facebook createObject() {

        Facebook facebook = new Facebook();

        facebook.setName("Ryan Weston");
        facebook.setAge(41);
        facebook.setStatus("Student");
        facebook.setScholarship(new BigDecimal("9250"));

        List<String> profile = new ArrayList<>();
        profile.add("Picture");

        facebook.setProfile(profile);

        return facebook;

    }

}
/* output 
Everything View {"name" : "Ryan Weston", "age":41, "Status" :"Student", "Scholarship" :"9250", "Profile" : "Picture"}
*/

