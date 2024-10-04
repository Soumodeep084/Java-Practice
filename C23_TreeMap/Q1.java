package C23_TreeMap;

import java.util.TreeMap;

public class Q1 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer , String> tmap = new TreeMap<>();
        tmap.put(1,  "Data1");
        tmap.put(23, "Data2");
        tmap.put(70, "Data3");
        tmap.put(4,  "Data4");
        tmap.put(2,  "Data5");
        
        System.out.println("TreeMap : " + tmap);
        
//        for(Map.Entry m : tmap.entrySet())
//        {
//            System.out.println(m.getKey() + " ---> " + m.getValue());
//        }

        tmap.remove(23);
        System.out.println("TreeMap : " + tmap);
        
        
        
    }
}
