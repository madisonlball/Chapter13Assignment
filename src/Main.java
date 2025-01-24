import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
  Dorm and Meal Plan Calculator
*/

public class Main extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }

   @Override
   public void start(Stage primaryStage)
   {
      // Build the Dorm ComboBox.


      // Label to prompt the user to select a dorm


      // Build the Meal Plan ComboBox.


      // Label to prompt the user to select a meal plan


      // Create the output label for total cost.


      // Create the Calculate button.


      // Register event handler for the button
      calcButton.setOnAction(event ->
      {
         double dormCharges = 0.0;
         double mealCharges = 0.0;
         double totalCharges = 0.0;

         if (dormComboBox.getValue() != null)
         {
            String dorm = dormComboBox.getValue();
            if (dorm.equals("Allen Hall"))
               dormCharges = 1800.0;
            else if (dorm.equals("Pike Hall"))
               dormCharges = 2200.0;
            else if (dorm.equals("Farthing Hall"))
               dormCharges = 2800.0;
            else if (dorm.equals("University Suites"))
               dormCharges = 3000.0;
            else
               dormCharges = 0.0;
         }

         if (mealComboBox.getValue() != null)
         {

            //code for mealComboBox

         }

         // Get the total charges
         totalCharges = dormCharges + mealCharges;

         // Display the charges.
         costOutputLabel.setText(String.format("%,.2f", totalCharges));
      });

      // Put everything into a VBox
      VBox mainVBox = new VBox(10, dormAndMealHBox, costHBox, calcButton);
      mainVBox.setAlignment(Pos.CENTER);
      mainVBox.setPadding(new Insets(10));

      // Add the main VBox to a scene.
      Scene scene = new Scene(mainVBox);

      // Set the scene to the stage aand display it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}