@FunctionalInterface
interface A{
    int add(int i,int j);
}

public class Ex1 {
    public static void main(String[] args) {
      A obj  = new A() {
        public int add(int i,int j){
            return i+j;
        }
      };
      int result = obj.add(4,5);
      System.out.println(result);
    }
}
 
