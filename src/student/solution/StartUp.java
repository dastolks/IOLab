package student.solution;

import java.io.*;
/**
 *
 * @author Alec
 */
public class StartUp {
    public static void main(String[] args) {
        File file1 = new File("src" + File.separatorChar + "contactList.txt");
        FileTextReader ftr = new FileTextReader();
        
        try{
            System.out.println("First Print");
            ftr.printFile(file1);
            System.out.println("Adding Someone");
            ftr.writeAddLineToFile(file1, "Alex Jones");
            ftr.writeAddLineToFile(file1, "Unassigned");
            ftr.writeAddLineToFile(file1, "Lansing,MI,50331");
            System.out.println("Second Print + Adding someone ");
            ftr.printFile(file1);
            System.out.println("Retrieving specific detail");
            ftr.retrievePersonSpecificDetail(file1, 2, EnumOfType.STATE);
        }
        catch(IOException ioe){
            System.out.println("IOException occured!");            
        }
        finally{
            
        }
        
    }
}
