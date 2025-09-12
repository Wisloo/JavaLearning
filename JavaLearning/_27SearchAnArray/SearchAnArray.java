package _27SearchAnArray;

public class SearchAnArray {
    public static void main(String[] args) {
        int [] numbers = {1, 5, 7, 9, 8, 20, 5, 6, 2};
        int target = 10;

        boolean isFound = false;

        for(int i = 0 ; i < numbers.length; i++) {
            if(target == numbers[i]) { // if our target hits the right current element
                System.out.println("Target found at index " + i);
                isFound = true;
                break; // to stop the loop incase something is found
            }
        }
        if (!isFound) {
            System.out.println("Element not found!");
        }


    }
}
