package _29TwoDimensionalArrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        // 2d Aray = An array where each element is an array
        //           useful for storing a matrix of data

        // String[] fruits = {"apple", "orange", "banana"};
        // String[] vegetables = {"potato", "carrot", "lentil"};
        // String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "carrot", "lentil"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[0][0] = "pineapple"; // changes the element in the specific index of the array
        groceries[1][0] = "celery";
       //  String[][] groceries = {fruits, vegetables, meats}; // you can list down all elements but just do this for more readability

        for(int i = 0; i < groceries.length; i++){ // loop rows
            for(int j = 0; j < groceries[i].length; j++) { // loop columns
                System.out.print(groceries[i][j] + " ");
            }
            System.out.println();
        }
    }
}
