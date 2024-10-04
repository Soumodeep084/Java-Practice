package C28_FileIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read 
{
    public static void main(String[] args) 
    {
        try 
        {
            File obj = new File("File1.txt");
            Scanner reader = new Scanner(obj);
            System.out.println("Data From File : \n");
            while(reader.hasNextLine())
            {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
