package C28_FileIO;

import java.io.File;

public class Delete 
{
    public static void main(String[] args) 
    {
        File obj = new File("File1.txt");
        if(obj.delete())
        {
            System.out.println(obj.getName() + " is deletd");
        }
        else
        {
            System.out.println("Failed to Delete the File.....");
        }
    }
}
