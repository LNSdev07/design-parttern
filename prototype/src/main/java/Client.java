public class Client {
    public static void main(String[] args) {
        User user1 = new User("Sonln", "sonln@gmail.com");
//        User user2 = user1;
        User user2 = user1.clone();
//        System.out.println(
//        "User1 = "+ user1);
//        System.out.println("User2 = "+ user2);
//        System.out.println("---------------------");
        user1.setName("daotth");
        System.out.println("User2 = "+ user2);

    }
}
