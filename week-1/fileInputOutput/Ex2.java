import  java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ex2 {
    public static void main(String[] args) {
        String[] names = {"john","Carl","Pavan"};
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Writing to a file");
        writer.write("\n Added second line to the code:");
        for(String name:names){
            writer.write("\n" +name);
        }
        writer.close();
    } catch(IOException e){
            e.printStackTrace();
        }

        try{
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
       String line;
       while((line = reader.readLine())!=null){
        
        System.out.println(line);
       }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
