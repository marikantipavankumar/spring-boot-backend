public class NullPointerException2 {
public static void main(String[] args) {
    Student s1 = null;
    try{
        s1.printName();
    }catch(java.lang.NullPointerException ne){
        System.out.println("Error: You have tried  to use an object that is null!");
    }
}

}

class Student{
    String name;

    void printName(){
        System.out.println("Student Name is:"+name.toUpperCase());
    }
}
