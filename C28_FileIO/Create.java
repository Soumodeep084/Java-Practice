package C28_FileIO;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args)
    {
        File obj = new File("File1.txt");
        try {
            if(obj.createNewFile())
            {
                System.out.println("File Created Successfully....");
            }
            else
            {
                System.out.println("File already Exists or not Created.....");
            }
        } 
        catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
