import java.io.File;
 
public class GFG {
   
    public static void main(String[] args)
    {
        // flag variable which contains the boolean
        // value returned by setReadOnly() function
        boolean flag;
       
        try {
           
            File file = new File("/home/mayur/GFG.java");
           
            // creates a new file
            file.createNewFile();
           
            // flag the file to be read-only
            flag = file.setReadOnly();
           
            System.out.println("Is File is read-only ? : "
                               + flag);
           
            // checking whether Is file  writable
            flag = file.canWrite();
            System.out.println("Is File is writable ? : "
                               + flag);
        }
       
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}