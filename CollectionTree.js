/**
 * Ryan Weston - CIT 360
 * Collections set
 */

import java.util.Set;
import java.util.TreeSet;

// name the class
public class CollectionsTree {
    
    public static void main(String[] args){
        /*TreeSet is simmilar to my set file, but it will put it in a 
        sequential order (notice the order of ages are our out of order,
        but it will print them in order because of the TreeSet)
        */
        Set<Integer> values = new TreeSet<>();
       
        // now add values to the set (lets add the age of my kids)
        // I put the values inside a print and it will test the values
        // to see if they will get added or not (true = yes they will add
        // false = no they will not be added).
        System.out.println(values.add(6)); // Cole is 6
        System.out.println(values.add(15));//Lilly is 15
        System.out.println(values.add(11));//Kanyon is 11
        System.out.println(values.add(11));//Kanyon is 11
        System.out.println(values.add(6)); // Cole is 6
        System.out.println(values.add(15));//Lilly is 15
        
        //print all the values
        for(int i : values){
            System.out.println(i);
        }
    }
}
/*
run:
true
true
true
false
false
false
6
11
15
BUILD SUCCESSFUL (total time: 0 seconds)

*/
