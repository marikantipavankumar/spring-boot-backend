// without Lambda Expression

// @FunctionalInterface
// interface Square{
//    int  square(int a);
// }
// public abstract class SquareEx {
//     public static void main(String[] args) {
//         Square obj = new Square() {
//             public int square(int a){
//                 return a*a;
//             }
//         };
//         System.out.println(obj.square(10));
//     }
// }

// with Lambda

@FunctionalInterface
interface  Square{
    int square(int a);
}

public class SquareEx{
    public static void main(String[] args) {
        Square Ex = a-> a*a;
        System.out.println(Ex.square(100));
    }
}