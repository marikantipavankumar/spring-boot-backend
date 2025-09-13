import java.io.*;
public class FileNotFoundException {
    public static void main(String[] args) {
       try {
           FileReader file = new FileReader("data.txt");
           BufferedReader br = new BufferedReader(file);
           String Line = br.readLine();
           System.out.println("File Content: "+Line);
           br.close();
       } catch (IOException e) {
        System.out.println("Error reading file: "+e.getMessage());
       } 
    }
}
