package C24_TreeSet;

import java.util.TreeSet;

public class Q2 
{
    public static void main(String[] args) 
    {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("A");
        tset.add("B");
        tset.add("C");
        tset.add("D");
        tset.add("E");
        
        System.out.println("Initial Set : " + tset);
        System.out.println("Reverse Set : " + tset.descendingSet());
        System.out.println("Head Set    : " + tset.headSet("C" , true));
        System.out.println("SubSet      : " + tset.subSet("A" , false, "E", true));
        System.out.println("Tail Set    : " + tset.tailSet("C", false));
    }
}
