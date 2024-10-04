package C28_FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Append 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter obj1 = new FileWriter("File1.txt" , true);
            Scanner sc = new Scanner(System.in);
            String str;
            System.out.println("Enter Your Address : ");
            str = sc.nextLine();
            obj1.write("\n" + str);
            System.out.println("Address added in File Successfully....");
            obj1.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
