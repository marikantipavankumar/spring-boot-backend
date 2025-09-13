// class A{
//     void show(){
//         for(int i = 1;i<=10;i++){
//             System.out.println("Hi");
//         }
//     }
// }

// class B{
//     void show(){
//         for (int i = 0; i < 10; i++) {
//              System.out.println("Hello");
//         }
       
//     }
// }

// public class MultiThreadEx1 {
//     public static void main(String[] args) {
//         A a = new A();
//         a.show();

//         B b = new B();
//         b.show();
//     }
// }


// with Thread Implemetation

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try{
            Thread.sleep(10);
            } catch(InterruptedException e) {
                e.printStackTrace();
        }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
              try{
            Thread.sleep(10);
            } catch(InterruptedException e) {
                e.printStackTrace();
        }
        }
    }
}

public class MultiThreadEx1 {
    public static void main(String[] args) {
        A a = new A();  // thread object A
        B b = new B();  // thread object B
       
        System.out.println(a.getPriority());
        b.setPriority(Thread.MAX_PRIORITY);
        System.out.println(b.getPriority());
        System.out.println(a.getPriority());
        a.start();      // starts thread A -> runs run()
        b.start();      // starts thread B -> runs run()
    }
}
