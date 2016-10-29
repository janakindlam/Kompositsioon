import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Jana on 29.10.2016.
 */
public class Main extends Application {
    @Override
            public void start(Stage primaryStage)throws Exception{
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400, Color.LIGHTCYAN);

        primaryStage.setScene(scene);
        Rectangle kast = new Rectangle(200, 80, Color.MAGENTA);
        kast.setLayoutX(30);
        kast.setLayoutY(80);
        pane.getChildren().add(kast);

        primaryStage.show();

    }

}
