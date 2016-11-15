package student.solution;

import java.io.*;
/**
 *
 * @author Alec
 */
public class StartUp {
    public static void main(String[] args) {
        File file1 = new File("src" + File.separatorChar + "contactList.txt");
        
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(file1));
            String line = br.readLine();
            int count = 0;
            while(line != null){
                count++;
                if(count == 4){
                    System.out.print(line + " State: ");
                }
                if(count == 6){
                    String[] set = line.split(",");
                    System.out.print(set[1] + " \n");
                }
                //System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException ioe){
            System.out.println("IOException occured!");            
        }
        finally{
            try{
                br.close();
            }
            catch(IOException ioe){
                
            }
        }
        
    }
}
