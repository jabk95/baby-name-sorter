import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * Scan a text file of baby names, and seperate girl and boys into two new files
 *
 * @jackson kirk
 *
 */
public class ScanBabyNames
{

    public static void main(String[] args) throws FileNotFoundException {
        try{
            File babyFile = new File("babnames.txt");
            Scanner nameScanner = new Scanner(babyFile) ;
            PrintWriter boysName = new PrintWriter("boysNames.txt");
            PrintWriter girlsName = new PrintWriter("girlsNames.txt");

            while(nameScanner.hasNextLine()){
                String line = nameScanner.nextLine();
                String[ ] lineInfo = line.split("\\s+");
                String boyName = lineInfo[1];
                String girlName = lineInfo[4];
                boysName.println(boyName);
                girlsName.println(girlName);
            }
            nameScanner.close();
            boysName.close();
            girlsName.close();
            }
        catch (Exception exception) { System.out.println("File Not Found");
        }
    }
}
