import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class SNOWMAN extends Application {
  public void start (Stage stage){

    Rectangle ground = new Rectangle(0,350,500,500);
    ground.setFill(Color.WHITE);

    Circle body = new Circle(200,325,35);
    body.setFill(Color.WHITE);

    Circle middle = new Circle(200,270,25);
    middle.setFill(Color.WHITE);

    Circle head = new Circle(200,235,20);
    head.setFill(Color.WHITE);

    Circle i1 = new Circle(195,233,2);
    i1.setFill(Color.BLACK);
    Circle i2 = new Circle(205,234,2);
    i1.setFill(Color.BLACK);

    Polygon nose = new Polygon();
    nose .getPoints().addAll(new Double[]{
    200.0, 232.0,
    180.0, 236.0,
    200.0, 240.0 });
    nose.setFill(Color.ORANGE);

    Rectangle hat1 = new Rectangle(180,215,40,5);
    hat1.setFill(Color.BLACK);
    Rectangle hat2 = new Rectangle(185,110,30,120);
    hat2.setFill(Color.BLACK);

    Rectangle arm1 = new Rectangle(175,270,5,25);
    arm1.setFill(Color.BROWN);
    Rectangle arm2 = new Rectangle(225,270,25,5);
    arm2.setFill(Color.BROWN);

    Group root = new Group(hat2,ground,body,middle,head,i1,i2,nose,hat1,arm1,arm2);
       Scene scene = new Scene(root, 400, 400, Color.BLUE);

       stage.setScene(scene);
       stage.show();
     }

     public static void main(String[] args){
       launch(args);

}
}
