import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;

/**
* @author Dallen Corry
* @version 1.0
* @since 2021/11/22
*/
public class Ex16_1 extends Application{
	@Override
	public void start(Stage s){
		//create panes
		BorderPane bp = new BorderPane();
		HBox top = new HBox(5);
		HBox bottom = new HBox(5);
		Pane pane = new Pane();
		
		//create pane elements
		Text t = new Text(110,95,"Programming is Fun!");
		Font f = new Font("Times New Roman",19);
		Button left = new Button("<=");
		Button right = new Button("=>");
		RadioButton red = new RadioButton("Red");
		RadioButton yellow = new RadioButton("Yellow");
		RadioButton black = new RadioButton("Black");
		RadioButton orange = new RadioButton("Orange");
		RadioButton green = new RadioButton("Green");
		
		//set properties of pane elements
		t.setFont(f);
		double textWidth = t.getLayoutBounds().getWidth();
		
		ToggleGroup tg = new ToggleGroup();
		red.setToggleGroup(tg);
		yellow.setToggleGroup(tg);
		black.setToggleGroup(tg);
		orange.setToggleGroup(tg);
		green.setToggleGroup(tg);
		
		black.setSelected(true);
		
		//set Action Handlers for Buttons and Radio Buttons
		red.setOnAction(e->t.setFill(Color.RED));
		yellow.setOnAction(e->t.setFill(Color.YELLOW));
		black.setOnAction(e->t.setFill(Color.BLACK));
		orange.setOnAction(e->t.setFill(Color.ORANGE));
		green.setOnAction(e->t.setFill(Color.GREEN));
				
		
		left.setOnAction(e ->{
			if(t.getX()>5){
				//go left
				t.setX(t.getX()-10);
			}else {
				t.setX(5);
			}
		});
		
		right.setOnAction(e ->{
			if(t.getX()<pane.getWidth()-textWidth-5){
				//go right
				t.setX(t.getX()+10);
			}
			else {
				t.setX(pane.getWidth()-textWidth-5);
			}
		});
		
		//add elements to panes
		top.setAlignment(Pos.CENTER);
		top.getChildren().addAll(red,yellow,black,orange,green);
		pane.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,null,null,new Insets(5,5,5,5))));
		pane.getChildren().add(t);
		bottom.setAlignment(Pos.CENTER);
		bottom.getChildren().addAll(left,right);
		
		//add panes to border pane
		bp.setTop(top);
		bp.setCenter(pane);
		bp.setBottom(bottom);
		
		//add panes to scene
		Scene scene = new Scene(bp,400,200);
		s.setScene(scene);
		s.setTitle("Exercise 16_1");
		s.show();
	}
	/*Main method*/
	public static void main(String[] args){
		launch(args);
	}
}
