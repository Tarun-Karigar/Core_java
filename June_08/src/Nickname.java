public class Nickname {
    public static void main(String[] args) {
        String nickname = "tarun" ;


        try {
            System.out.println("nickname is: " + nickname);
        } catch (NullPointerException e) {
            System.out.println("Error: Nickname is null ");
        }
    }
}
