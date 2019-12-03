import java.io.FileInputStream;
import java.util.Scanner;

public class FileCow extends Cow
{
    private static String filename;
//    public FileCow(String name, String filename) throws RuntimeException("MOOOOO!!!!!!");
//    {
//        //Constructor; creates a new FileCow object with the given name and an image loaded from filename.
//        //If the file cannot be loaded, it should throw a new RuntimeException with the message "MOOOOO!!!!!!".
//        //This should be the only public constructor for the FileCowclass!
//        super(name);
//        super(getImage(setImage(filename)));
//    }

    public FileCow(String name, String filename)
    {
        //Constructor; creates a new FileCow object with the given name and an image loaded from filename.
        //If the file cannot be loaded, it should throw a new RuntimeException with the message "MOOOOO!!!!!!".
        //This should be the only public constructor for the FileCowclass!
        super(name);
        this.filename = filename;
        try
        {
            FileInputStream inStream = new FileInputStream(filename);
            Scanner fileScanner = new Scanner(inStream);
            image = "";

            while (fileScanner.hasNextLine())
            {
                image += fileScanner.nextLine() + "\n";
            }

            inStream.close();
        }

        catch (RuntimeException ee)
        {
            throw new RuntimeException("MOOOOO!!!!!!");
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void setImage()
    {
        //Should immediately throw a new RuntimeExceptionwith the message "Cannot reset FileCow Image".
        throw new RuntimeException("Cannot reset FileCow Image");
    }
}