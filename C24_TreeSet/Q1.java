package C24_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Q1 
{
    public static void main(String[] args) 
    {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("ABC");
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        System.out.println("TreeSet : " + tset);
        
        Iterator it = tset.descendingIterator();
        System.out.print("TreeSet : ");
        while(it.hasNext())
        {
            System.out.print(it.next() + "  ");
        }
    }
}
