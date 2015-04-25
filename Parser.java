
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class Parser{
    
    private String currentline;
    private BufferedReader reader;
    private boolean inComment = false;
    
    public static void main(String... args){
        new Parser(args);
    }
    
    public Parser(String... args){
        
        //TODO read off args to find shader
        if(args.length !=0){
        File shaderPath = new File(args[0]);
        try(BufferedReader reader =new BufferedReader(new FileReader(shaderPath));){
        System.out.println("File opened");//start parsing the file
        do {
            currentline = reader.readLine();
            checkForComents(currentline);
            
        }while(currentline!=null);
                }
                catch(EOFException eof){
            System.out.println("finished parsing");
            System.exit(0);
        }catch(IOException e){
            System.out.println("could not open file");
        }
        
        }else{
            // I may take input from standard in later
            System.out.println("No shader was given");
            
        }
        
        
        
        }
        String checkForComents(String line){
            boolean inQoute = false;
            //check for comments and quotes
            if(inComment){
                int index;
                index=line.indexOf("*/");
                if(index == -1){
                    return "";
                }
                return line.substring(index+2);
            }else{
            line.indexOf("/");
            }
            return line;//the parsable content
    }
        
    
}
