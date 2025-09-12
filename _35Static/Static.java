package _35Static;

public class Static {
    public static void main(String[] args) {
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object
        //          commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Louis");
        Friend friend2 = new Friend("Dei");
        Friend friend3 = new Friend("Ate Alexis");
        Friend friend4 = new Friend("Panda");
        Friend friend5 = new Friend("Bear");
        Friend friend6 = new Friend("Aichi");
        Friend friend7 = new Friend("Dodong");

        // System.out.println(friend1.numOfFriends);
        // System.out.println(friend2.numOfFriends);

        // System.out.println(Friend.numOfFriends); // it is better to access the static member by the name of the class itself rather than any object
        Friend.showFriends();
    }
}
