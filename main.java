
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class main{
    public static void main(String... args){
        //TODO read off args to find shader
        if(args.length !=0){
        File shaderPath = new File(args[0]);
        try{
        BufferedReader reader =new BufferedReader(new FileReader(shaderPath));
        System.out.println("File opened");
        }catch(IOException e){
            System.out.println("could not open file");
        }
        }else{
            // I may take input from standard in later
            System.out.println("No shader was given");
        }
        
    }
}
