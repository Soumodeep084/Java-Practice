package C28_FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        try 
        {
            File obj1 = new File("File1.txt");
            FileWriter obj2 = new FileWriter("CopyFile1.txt" , true);
            Scanner reader = new Scanner(obj1);

            while (reader.hasNextLine()) 
            {
                String data = reader.nextLine();
                obj2.write(data + "\n"); // Append newline character
            }

            reader.close();
            obj2.close(); 

            File obj = new File("CopyFile1.txt");
            if (obj.length() > 0) 
            {
                System.out.println("Data copied to new file successfully.");
            } 
            else 
            {
                System.out.println("Data was not copied to new file.");
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
