package _35Static;



public class Friend {
    static int numOfFriends; // rather than each object having different copies of friends, static is there to make sure that they will only share one
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }
    static void showFriends() {
        System.out.println("You have " + numOfFriends + " friends");
    }
}
