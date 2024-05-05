package Module6_GUIAndEventDrivenProgramming.Part3_VirtualPet;

public class PetController {
    // Properties
    private PetModel pet;

    // Constructor
    public PetController(PetModel pet) {
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
