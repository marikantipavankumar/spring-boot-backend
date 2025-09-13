import  java.io.*;

class Emp implements  Serializable{
    public String name;
    public String address;

}
public class Deserializable {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Emp e = null;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Backend\\spring-boot-backend\\week-1\\serialization\\Char.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            e = (Emp) objIn.readObject();
            objIn.close();
            fileIn.close();
        } 
        finally{
            System.out.println("Deserializing Object:");
            System.out.println("Name of the Employee is:"+e.name);
            System.out.println("Address of the Employee is:"+e.address);
        }
    }
}
