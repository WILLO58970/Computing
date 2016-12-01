package A2;

import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class LinearDataStructures
{

    public static void main(String[] args)
    {

        String[] myArray = new String[6];
        myArray[0] = "Phil Coulson";
        myArray[1] = "Melinda May";
        myArray[2] = "Daisy Johnson";
        myArray[3] = "Leo Fitz";
        myArray[4] = "Jemma Simmons";
        myArray[5] = "Alphonso MacKenzie";
        System.out.println(myArray[0]);

        List<String> myList = new ArrayList<>();
        myList.add("Tony Stark");
        myList.add("Steve Rogers");
        myList.add("Bruce Banner");
        myList.add("Thor");
        myList.add("Natasha Romanoff");
        myList.add("Clint Barton");
        myList.set(4, "Black Widow");                
        myList.remove(2);
        myList.remove(3);
        myList.add("Vision");
        myList.add("Wanda Maximoff");        
        System.out.println(myList.get(0));

        ArrayDeque<String> myDeque = new ArrayDeque<>();
        myDeque.addFirst("Daredevil");              // or myDeque.push(...)
        myDeque.addLast("Jessica Jones");     
        myDeque.addLast("Luke Cage");
        myDeque.addLast("Iron Fist");           
        myDeque.removeFirst();                      
        myDeque.removeLast();                       // or myDeque.pop()
        System.out.println(myDeque.getFirst());     // or myDeque.peek()

        //n.b. push, pop and peek are stack methods       

        myList = new LinkedList<>();   
        myList.add("Tony Stark");
        myList.add("Steve Rogers");
        myList.add("Bruce Banner");
        myList.add("Thor");
        myList.add("Natasha Romanoff");
        myList.add("Clint Barton");
        myList.set(4, "Black Widow");                
        myList.remove(2);
        myList.remove(3);
        myList.add("Vision");
        myList.add("Wanda Maximoff");        
        System.out.println(myList.get(0));

    }
}
