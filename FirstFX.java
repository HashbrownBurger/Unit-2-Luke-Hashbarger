import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;



public class FirstFX extends Application {

  public void start(Stage stage){
    Text sleep = new Text (1,110, "I wish I was sleeping");
    sleep.setFill(Color.WHITE);
    Rectangle rec = new Rectangle(100, 20, Color.YELLOW);
    Line line = new Line();
    line.setStartX(50.0f);
    line.setStartY(20.0f);
    line.setEndX(50.0f);
    line.setEndY(100.0f);
    line.setFill(Color.PURPLE);
    Circle circle = new Circle();
    circle.setCenterX(50.0f);
    circle.setCenterY(75.0f);
    circle.setRadius(25.0f);
    circle.setFill(Color.GREEN);

    Polygon poly = new Polygon();
    poly.getPoints().addAll(new Double[]{
      100.0,150.0,
      50.0,160.0,
      150.0,180.0});

    Group root = new Group(rec,line,circle,poly,sleep);
    Scene scene = new Scene(root, 300,300, Color.BLUE);

    stage.setTitle("FirstFX");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
