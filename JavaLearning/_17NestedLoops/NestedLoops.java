package _17NestedLoops;

public class NestedLoops {
    public static void main(String[] args) {
        // nested loop = A loop inside anotehr loop
        //               used often with matrices or DS&A


        for(int i = 1; i <= 3; i++) { // print the inside loop a variable amount of times (condition)
            for(int j = 1; j <= 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
