package C28_FileIO;

import java.io.File;

public class Get_Information 
{
    public static void main(String[] args) 
    {
        File obj = new File("File1.txt");
        if(obj.exists())
        {
              System.out.println("File Name  : " + obj.getName()); 
              System.out.println("File Path  : " + obj.getAbsolutePath());
              System.out.println("Writeable  : " + obj.canWrite());
              System.out.println("Readable   : " + obj.canRead());
              System.out.println("Length in Bytes : " + obj.length());
        }
        else
        {
            System.out.println("File Doesn't Exist ");
        }
    }
}
