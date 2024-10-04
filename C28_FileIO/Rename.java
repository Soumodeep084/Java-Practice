package C28_FileIO;

import java.io.File;
import java.util.Scanner;

public class Rename 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        File obj = new File("File1.txt");
        
        System.out.println("Enter Name to Rename : ");
        String str = sc.nextLine();
        
        File obj1 = new File(str+".txt");
        if(obj.exists())
        {
            if(obj.renameTo(obj1))
            {
                System.out.println("File Renamed Suucessfully");
            }
            else
            {
                System.out.println("File Doesn't Renamed");
            }
        }
        else
        {
            System.out.println("File Doesn't Exist...");
        }
    }
}
