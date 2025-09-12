package _10SubString;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        // .substring() = A method used to extract a portion of a string
        //              string.substring(start, end)
        Scanner scanner = new Scanner(System.in);
        String email = "";
        System.out.println("Enter your email: ");
        email = scanner.nextLine();


        String domain = email.substring(email.indexOf("@") + 1); // indexOf will allow you to not manually type the index
        String username = email.substring(0,email.indexOf("@")); // this is how to create a substring, second index is always exclusive
        System.out.println("Suggested username is: " + username);
        System.out.println("Common domain: " + domain);


    }
}
