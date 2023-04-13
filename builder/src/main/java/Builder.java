public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildPool(boolean hasPool);
    Builder buildWall(int walls);
    Builder buildDoor(int doors);
    Builder buildColor(String color);

    House build();
}
