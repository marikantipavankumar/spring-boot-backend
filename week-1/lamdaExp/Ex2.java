// @FunctionalInterface
// interface Calculator{
//     int add(int a,int b);
// }

// public class Ex2 {
//     public static void main(String[] args) {
//         Calculator c = new Calculator() {
//             public int add(int a,int b){
//                 return a+b;
//             }

//         };
//         System.out.println(c.add(10,30));
//     }
// }


// with Lambda

@FunctionalInterface
interface Calculator{
    int add(int a,int b);
}

class Ex2{
    public static void main(String[] args) {
        Calculator obj = (a,b)->a+b;
        System.out.println(obj.add(10,50));
    }
}