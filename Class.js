/*
 * Ryan Weston - CIT360
* this is an example I made for a class.  
* very simple and basic, but it works.
 */
 
 //this part creates an object called "MyClass"
 // and assigns a value of 41 to x and a value of y to 15
public class MyClass {
    int x=41;
    int y= 15;
  
 //Then we create a (new) object and assign it to MyClass
 // it will take that object and print out the value of each class
public static void main(String[] args){
    MyClass myobj1 = new MyClass();
    MyClass myobj2 = new MyClass();
    System.out.println(myobj1.x);
    System.out.println(myobj2.y);
    }
    
}

/* This is the output from the above:
run:
41
15
BUILD SUCCESSFUL (total time: 0 seconds)
*/
