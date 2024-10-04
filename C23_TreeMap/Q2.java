package C23_TreeMap;

import java.util.Map;
import java.util.TreeMap;

class Book
{
    int id , qty;
    String name , author;
    public Book(String name , String author , int id , int qty)
    {
        this.name = name;
        this.author = author;
        this.id = id;
        this.qty = qty;
    }
}

public class Q2 
{
    public static void main(String[] args) 
    {
        TreeMap<Integer , Book> tmap = new TreeMap<>();
        
        Book b1 = new Book("Let Us C "             , "Yashwant Kanetkar" , 101 , 150);
        Book b2 = new Book("Engineering Graphics"  , "N.H Dubey"         , 102 , 200);
        Book b3 = new Book("Electrical Engineering" , "Ravish Singh"     , 103 , 100);
        
        tmap.put(2, b2);
        tmap.put(3, b3);
        tmap.put(1, b1);
        
        for(Map.Entry<Integer , Book> ent : tmap.entrySet())
        {
            Book b = ent.getValue();
            System.out.println("====================================================");
            System.out.println("Id       : " + b.id);
            System.out.println("Name     : " + b.name);
            System.out.println("Author   : " + b.author);
            System.out.println("Quantity : " + b.qty);
        }
    }
}
