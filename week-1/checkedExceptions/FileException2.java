import java.io.*;

public class FileException2{
    public static void main(String[] args){
        try {
            readFile();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File Not Found Exception:"+e);
        }
    }

    public static void readFile() throws java.io.FileNotFoundException{
        FileReader fr = new FileReader("pavan.txt");
        System.out.println("File opened Successfully:");
        fr.close();
    }
}