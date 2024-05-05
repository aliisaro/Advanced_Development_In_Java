package Module6_GUIAndEventDrivenProgramming.Part3_VirtualPet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PetView extends Application {
    private static final int CELL_SIZE = 40;
    private Canvas canvas;
    private GraphicsContext gc;
    private PetController controller;
    private Image petImage = new Image("file:src/main/java/Module6_GUIAndEventDrivenProgramming/Part3_VirtualPet/doggy.jpg");
    private static final int DELAY = 120; // Delay in milliseconds

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        PetModel pet = new PetModel(0, 0); // Create an instance of Pet
        controller = new PetController(pet); // Pass pet to the Controller constructor
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;

        // Create a canvas and get its graphics context
        canvas = new Canvas(canvasSize, canvasSize);
        gc = canvas.getGraphicsContext2D();

        // Set up mouse event handler
        canvas.setFocusTraversable(true);
        canvas.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();
            System.out.println("Mouse moved to (" + x + ", " + y + ")");

            // Calculate pet position based on mouse coordinates
            int petX = (int) (x / CELL_SIZE);
            int petY = (int) (y / CELL_SIZE);

            // Introduce a delay before moving the pet
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Update canvas and controller with new pet position
            updateCanvas(petX, petY);
            controller.movePet(Direction.RIGHT);
        });

        // Set up the scene
        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, canvasSize, canvasSize);
        primaryStage.setTitle("Virtual pet");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Initialize canvas with initial pet position
        updateCanvas(controller.getPetX(), controller.getPetY());
    }

    // Update the canvas with the pet's new position
    public void updateCanvas(int petX, int petY) {
        int gridSize = controller.getGridSize();
        int canvasSize = gridSize * CELL_SIZE;

        gc.clearRect(0, 0, canvasSize, canvasSize);

        // Draw pet image
        gc.drawImage(petImage, petX * CELL_SIZE, petY * CELL_SIZE, CELL_SIZE, CELL_SIZE);
    }
}

