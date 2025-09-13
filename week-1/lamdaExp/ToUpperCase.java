
// @FunctionalInterface
// interface TypeConversion{
//     String toUpper(String s);
// }
// public class ToUpperCase {
//     public static void main(String[] args) {
//         TypeConversion obj = new TypeConversion() {
//             public String toUpper(String s){
                
//                 return s.toUpperCase();
//             }
             
            
//         };
//         System.out.println(obj.toUpper("Hello Pavan"));
//     }
// }


//with Lambda 
@FunctionalInterface
interface TypeConversion{
    public String toUpper(String s);
}
public class ToUpperCase{
    public static void main(String[] args){
        TypeConversion obj = s->s.toUpperCase();
        System.out.println(obj.toUpper("Hey Pavan Marikanti"));
    }
}