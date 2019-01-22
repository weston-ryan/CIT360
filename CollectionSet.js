/**
 * Ryan Weston - CIT 360
 * Collections set
 */

import java.util.HashSet;
import java.util.Set;

// name the class
public class CollectionsSet {
    
    public static void main(String[] args){
        //create the object of set and search for a class
        //that implements set and that class is HashSet
        //in "Set" below, it only supports unique elements (
        //I can't have 2 different values of "(6)", it will only print one value).
        Set<Integer> values = new HashSet<>();
       
        // now add values to the set (lets add the age of my kids)
        values.add(6); // Cole is 6
        values.add(11);//Kanyon is 11
        values.add(15);//Lilly is 15
        
        //print all the values
        for(int i : values){
            System.out.println(i);
        }
    }
}
/*
output is:
run:
6
11
15
BUILD SUCCESSFUL (total time: 0 seconds)

*/
