import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import  java.io.*;


class Emp implements  Serializable{
    public String name;
    public String address;

}

// main class
public class SerializationEx1 {
    public static void main(String[] args){
        Emp e = new Emp();
        e.name = "Pavan Marikanti";
        e.address = "Hyderabad";

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Backend\\spring-boot-backend\\week-1\\serialization\\Char.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved  in chat.txt file");
        }catch(IOException emp) {
            emp.printStackTrace();
        }
    }
}
