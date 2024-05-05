package Module6_GUIAndEventDrivenProgramming.Part3_VirtualPet;

public class PetModel {
    // Properties
    private int x;
    private int y;
    private static final int GRID_SIZE = 10;

    // Constructor
    public PetModel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to move the pet and storing the new position
    public void move(Direction direction) {
        switch (direction) {
            case UP:
                if (y >= 1) {
                    y--;
                }
                break;
            case DOWN:
                if (y < GRID_SIZE - 1) {
                    y++;
                }
                break;
            case LEFT:
                if (x >= 1) {
                    x--;
                }
                break;
            case RIGHT:
                if (x < GRID_SIZE - 1) {
                    x++;
                }
                break;
        }
        System.out.println("Pet moved to (" + x + ", " + y + ")");
    }

    // Getters
    public int getX() {
        return x;
    }
    public int getY() { return y;}
    public static int getGridSize() {
        return GRID_SIZE;
    }
}
