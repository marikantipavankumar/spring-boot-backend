public class NullPointerException {
    public static void main(String[] args) {
        try{
        String str = null;
        System.out.println("string length is:"+str.length());
        }
        catch(java.lang.NullPointerException ne){
            System.out.println("Null value used :"+ne.toString());
        }
    }
}
