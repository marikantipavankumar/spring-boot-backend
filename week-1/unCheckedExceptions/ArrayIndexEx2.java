public class ArrayIndexEx2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,12,32};
        try {
            for(int i = 0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array Index out of Bounds:"+ae);

        }
    }
}
