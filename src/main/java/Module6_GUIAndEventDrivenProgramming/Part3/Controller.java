package Module6_GUIAndEventDrivenProgramming.Part3;

public class Controller {
    // Properties
    private Pet pet;

    // Constructor
    public Controller(Pet pet) {
        this.pet = pet;
    }

    // Method to update the pet's position
    public void movePet(Direction direction) {
        pet.move(direction);
    }

    // Getters
    public int getPetX() {
        return pet.getX();
    }

    public int getPetY() {
        return pet.getY();
    }

    public int getGridSize() {
        return pet.getGridSize();
    }
}
