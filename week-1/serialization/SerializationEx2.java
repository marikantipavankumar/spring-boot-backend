import java.io.*;

//class which implements serializable
class Demo implements  Serializable{
    public int a;
    public String b;

    Demo(int a,String b){
        this.a = a;
        this.b = b;
    }
}

public class SerializationEx2 {
    public static void main(String[] args) {
        Demo d =new Demo(10,"Pavan");

        try {
            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Backend\\spring-boot-backend\\week-1\\serialization\\Ex2.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(d);
            out.close();
            fileOut.close();
            System.out.println("Object has been serialized");
        } catch(IOException ex) {
            System.out.println("IOException is Caught");
        }

        Demo object1 = null;
        try {
            FileInputStream file  = new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Backend\\spring-boot-backend\\week-1\\serialization\\Ex2.txt");
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (Demo) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized");
            System.out.println("a="+object1.a);
            System.out.println("b= "+object1.b);
            } catch (IOException ex) {
                System.out.println("IOException is caaught");
        }catch(ClassNotFoundException ex){
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
