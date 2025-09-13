// without Lamda

// @FunctionalInterface
// interface CheckEvenOrOdd{
//     String evenOdd(int n);
// }
// public class EvenOrOdd {
//   public static void main(String[] args) {
//       CheckEvenOrOdd obj = new CheckEvenOrOdd() {
//         public String evenOdd(int n){
//             if(n%2==0){
//                 return "even";
//             }
//             else{
//             return "Odd";
//         }
//     }
//       };
//       System.out.println("The given number is:"+obj.evenOdd(20));
//   }  
// }


// with Lamda
@FunctionalInterface
interface EvenOdd{
    public String evenOdd(int n);
}

public class EvenOrOdd{
    public static void main(String[] args) {
        EvenOdd obj = n->(n%2==0)? "Even" : "Odd";
        
        System.out.println("7 is:"+obj.evenOdd(7));
        System.out.println("10 is:"+obj.evenOdd(10));
    }
  }
