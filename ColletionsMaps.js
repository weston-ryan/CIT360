
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *Ryan Weston - CIT 360
 * Collections Map
 */
public class CollectionsMaps {
    
    public static void main(String[] args){
    
    // map is a key value and I will call the HashMap package
    // "String, String" are for the key and value
    Map<String,String> map = new HashMap();
    
    //lets ass two things, the key and the value 
    //instead of using add I will use put, then 
    // add a key (myName) and value (Ryan Weston)etc...
    map.put("myName", "Ryan Weston");
    map.put("Wife", "Heather Weston");
    map.put("Daughter", "Lilly Weston");
    map.put("Middle Son", "Kanyon Weston");
    map.put("Youngest Son", "Cole Weston");
    
    // this will print the key & value in no particular order
    System.out.println(map);
    
    //this will print them in the order of the key
    System.out.println(map.get("myName"));
    System.out.println(map.get("Wife"));
    System.out.println(map.get("Daughter"));
    System.out.println(map.get("Middle Son"));
    System.out.println(map.get("Youngest Son"));
    
    // this will store the value in a set and print them by the key
    // instead of doing a seperate print line for each key
    // this will print out the key and value
    Set<String> keys = map.keySet();
    for(String key : keys){
        System.out.println(key + " " + map.get(key));
    }
    }
}
/*
run:
{Middle Son=Kanyon Weston, Youngest Son=Cole Weston, Daughter=Lilly Weston, Wife=Heather Weston, myName=Ryan Weston}
-----------------------------------
Ryan Weston
Heather Weston
Lilly Weston
Kanyon Weston
Cole Weston
--------------------------------
Middle Son Kanyon Weston
Youngest Son Cole Weston
Daughter Lilly Weston
Wife Heather Weston
myName Ryan Weston
BUILD SUCCESSFUL (total time: 0 seconds)

*/
