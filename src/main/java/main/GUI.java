package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.stage.Stage;


public class GUI extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {

		ToolBar toolBar = FXMLLoader.load(getClass().getResource("/likes-tool.fxml"));

		TemplateController.setToolBar(toolBar);

		Scene scene = new Scene(toolBar);

		stage.setScene(scene);
		stage.show();
	}
}
