/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.solution;

import java.io.*;
/**
 *
 * @author Alec
 */
public class FileTextReader {
    private int cityArea = 0;
    private int stateArea = 1;
    private int zipCode = 2;
    
    public FileTextReader(){
        
    }
    
    public void printFile(File f) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
    public void writeAddLineToFile(File f, String s) throws IOException{
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
        out.println(s);
        out.close();
    }
    public void retrievePersonSpecificDetail(File f, int rowCount, EnumOfType et) throws IOException{
        int actualCount = (rowCount-1)*3;
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();
        String[] sBreak = null;
        int counter = 0;
        while(counter < actualCount){
            counter++;
            line = br.readLine();
        }
        System.out.print(line);
        switch(et){
            case ADDRESS:
                line = br.readLine();
                System.out.println(" Address: " + line);
            break;
            case CITY:
                line = br.readLine();
                line = br.readLine();
                sBreak = line.split(",");
                System.out.println(" City: " + sBreak[cityArea]);
            break;  
            case STATE:
                line = br.readLine();
                line = br.readLine();
                sBreak = line.split(",");
                System.out.println(" City: " + sBreak[stateArea]);                
            break;
            case ZIPCODE:
                line = br.readLine();
                line = br.readLine();
               sBreak = line.split(",");
                System.out.println(" City: " + sBreak[zipCode]);                
            break;
        }
        
        
        br.close();
        
    }
}
