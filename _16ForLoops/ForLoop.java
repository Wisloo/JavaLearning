package _16ForLoops;

public class ForLoop {
    public static void main(String[] args) {
        // for loop = execute some code a CERTAIN amount of times

        System.out.println("Incrementing: ");
        for(int i = 0; i < 10; i++) { // (initialization; condition; iteration)
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Decrementing:");
        for(int i = 10; i > 0; i--) { // decrementing
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Incremeting by a certain number:");
        for(int i = 0; i < 10; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Decrementing by a certain number:");
        for(int i = 10; i > 0; i-=2) { // decrementing
            System.out.print(i + " ");
        }
    }
}
