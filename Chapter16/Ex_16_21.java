package timer;

import java.io.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.media.*;
import javafx.geometry.Pos;
import javafx.animation.*;
import javafx.event.*;

public class Ex_16_21 extends Application {
	public static final File FILE = new File("anthem0.mp3");
	private static final String MEDIA_URL = "file:"+FILE.getAbsolutePath();
			//This link does not work for some reason
//			"https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";

			//This one below definitely works, as long as the path is correct for your specific device
			//if on Mac the "file:" is necessary before the path, not certain if needed for Windows
//			"file:/Users/student/eclipse-workspace/timer/anthem0.mp3";
	@Override
	public void start(Stage s) {
		//Try catch block for Audio File errors
		try {
			//create objects
			TextField txt = new TextField("5");
			Pane pane = new Pane(txt);
			
			Font fnt = new Font("Times New Roman",50);
			Media media = new Media(MEDIA_URL);
			MediaPlayer mediaPlayer = new MediaPlayer(media);
			
			//set properties of objects
			txt.setFont(fnt);
			txt.setAlignment(Pos.CENTER);

			txt.prefWidthProperty().bind(pane.widthProperty());
			txt.prefHeightProperty().bind(pane.heightProperty());
			
			//define animation
			EventHandler<ActionEvent> eventHandler = e -> {
				if(txt.getText().equals("1")||txt.getText().equals("0")) {
					txt.setText("0");
					mediaPlayer.play();
				}else {
					txt.setText((Integer.valueOf(txt.getText())-1)+"");
				}
					
			};
			
			Timeline animation = new Timeline(
					new KeyFrame(Duration.seconds(1), eventHandler)
			);
			
			
			//animation trigger
			txt.setOnAction(e->{
				//try catch blocks for digit errors
				try {
					if(Integer.valueOf(txt.getText())%1==0) {
						mediaPlayer.pause();
						mediaPlayer.stop();
						animation.setCycleCount(Integer.valueOf(txt.getText()));
						animation.play();
					}
				}catch (Exception E){
					System.out.println("not a number");
					txt.setText("Enter a NUMBER");
				}
			});
			
			//add nodes to scene and stage.
			Scene scene = new Scene(pane,250,150);
			s.setScene(scene);
			s.setTitle("Enter a Number");
			s.show();
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("The File path must be corrected. Current path:");
			System.out.println(MEDIA_URL);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
