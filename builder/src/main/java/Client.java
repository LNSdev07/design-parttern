public class Client {
    public static void main(String[] args) {
        House house1 = new HouseBuilder()
                .buildDoor(4)
                .buildWall(4)
                .buildColor("Red")
                .build();
        System.out.println(house1);
    }
}
