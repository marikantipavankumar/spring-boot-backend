public class ArrayEx {
    public static void main(String[] args) {
        try {
            
            int[] a = {1,2,4,5,6};
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Index out of range:"+ae);
        }

    }
}
