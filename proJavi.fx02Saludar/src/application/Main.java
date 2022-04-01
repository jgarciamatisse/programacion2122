package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
			//Creo tres componentes
			Label lblNombre = new Label("Nombre");
			TextField txtNombre = new TextField("pepe");
			Button btnSaludar = new Button("Saludar");
			btnSaludar.setOnAction((e)->{
				System.out.println("Hola " + txtNombre.getText());
				Alert a = new Alert(AlertType.INFORMATION);
				a.setTitle("Saludo");
				a.setHeaderText("Bienvenido!!!");
				a.setContentText("Hola " + txtNombre.getText());
				a.showAndWait();
				System.out.println("Fin");
			});
			
			//Los añado al contendor principal (root)
			root.getChildren().add(lblNombre);
			root.getChildren().add(txtNombre);
			root.getChildren().add(btnSaludar);
			
			
			
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
