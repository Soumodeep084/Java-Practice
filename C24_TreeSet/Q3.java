package C24_TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

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


public class Q3 
{
    public static void main(String[] args) 
    {
        TreeSet<Book> tset = new TreeSet<>(Comparator.comparingInt(book -> book.id));   
        Book b1 = new Book("Let Us C "             , "Yashwant Kanetkar" , 101 , 150);
        Book b2 = new Book("Engineering Graphics"  , "N.H Dubey"         , 102 , 200);
        Book b3 = new Book("Electrical Engineering" , "Ravish Singh"     , 103 , 100);
        
        tset.add(b2);
        tset.add(b3);
        tset.add(b1);
        
        Iterator<Book> it = tset.iterator();
        while(it.hasNext())
        {
            Book b = it.next();
            System.out.println("====================================================");
            System.out.println("Id       : " + b.id);
            System.out.println("Name     : " + b.name);
            System.out.println("Author   : " + b.author);
            System.out.println("Quantity : " + b.qty);
        }
//        for(Book b : tset)
//        {
//            System.out.println("====================================================");
//            System.out.println("Id       : " + b.id);
//            System.out.println("Name     : " + b.name);
//            System.out.println("Author   : " + b.author);
//            System.out.println("Quantity : " + b.qty);
//        }
    }
}
