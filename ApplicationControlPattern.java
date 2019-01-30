/*
 *Ryan Weston - CIT 360
Application Control Pattern Using Hashmap
 */
package applicationcontrolpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import static javax.swing.text.StyleConstants.ModelAttribute;

public class ApplicationControlPattern {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // hashmap declaration with default size and load factor
       HashMap<String, Integer> hashMap = new HashMap<>();
        // a hashmap with multiple values and a default size & load factor
        //multiple values will create an array list
       HashMap<String, ArrayList<String>> multiMap = new HashMap<>();
       
       // put elements into the hashmap (family name)
       hashMap.put("Ryan", 1);
       hashMap.put("Heather", 2);
       hashMap.put("Lilly", 3);
       hashMap.put("Kanyon", 4);
       hashMap.put("Cole", 5);
     
      //create a greating controller for the elements in the ArrayList
      //this controller handles get and post requests and adds an
      //instance of a HashMap greeting, which stores the object of type greeting.
    @Controller
 class GreetingController {

    private static final Map<int,Greeting> hashMap = new HashMap<>();

    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    public String greetingForm(Model model,  @RequestParam(value = "greetingId", required = false) Integer greetingId) {
        Greeting greeting = hashMap.get(greetingId)
                return greeting.getGreeting();
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        int count = hashMap.size();
        hashMap.put((count+1),greeting);
        return "result";
    }
}



       //take a value of a specific key - or give it a value
       System.out.println("Simple HashMap: Key 'Ryan' has value = " + hashMap.get("Ryan"));
       System.out.println("Simple HashMap: Key 'Heather' has value = " + hashMap.get("Heather"));
       System.out.println("Simple HashMap: Key 'Lilly' has value = " + hashMap.get("Lilly"));
       System.out.println("Simple HashMap: Key 'Kanyon' has value = " + hashMap.get("Kanyon"));
       System.out.println("Simple HashMap: Key 'Cole' has value = " + hashMap.get("Cole"));
       
       // see if a specific value or key is in the hashMap if so, mark it true
       System.out.println("Simple HashMap containes value '1' - " + hashMap.containsValue(1));
       System.out.println("Simple HashMap containes value '2' - " + hashMap.containsValue(2));
       System.out.println("Simple HashMap containes value '3' - " + hashMap.containsValue(3));
       System.out.println("Simple HashMap containes value '4' - " + hashMap.containsValue(4));
       System.out.println("Simple HashMap containes value '5' - " + hashMap.containsValue(5));
      
       //create an arrayList to store values 
       // the values are the favorite color of the elements 
       ArrayList<String> listOne = new ArrayList<>();
       listOne.add("Green");
       listOne.add("Blue");
       listOne.add("Blue");
       listOne.add("Red");
       listOne.add("Green");
       
       //put the values into the map
       multiMap.put("Their Favorite color", listOne);
       
       // Get a set of the entries from above
       Set<Entry<String, ArrayList<String>>> setMap = multiMap.entrySet();

       // get the iterator
       Iterator<Entry<String,  ArrayList<String>>> iteratorMap = setMap.iterator();
       
      System.out.println("\nHashMap with Multiple Values");

      // display all of the elements
      while(iteratorMap.hasNext()) {
        Map.Entry<String, ArrayList<String>> entry = (Map.Entry<String, ArrayList<String>>) iteratorMap.next();
        String key = entry.getKey();
        List<String> values = entry.getValue();
        System.out.println("Key = '" + key + "' has values: " + values);
      }
    }
}
