import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Created by kho on 26.09.2016.
 */
public class Algus extends Application {
    public static void main (String[] args) {
       launch(args);
    }

    final int PINNA_LAIUS = 600;
    final int PINNA_KORGUS = 600;

    public void start(Stage suurAken) {
        suurAken.setTitle("Seebimull");

        Group root = new Group();
        Scene peaStseen = new Scene( root );
        suurAken.setScene( peaStseen );

        Canvas manguPind = new Canvas( PINNA_LAIUS, PINNA_KORGUS);
        root.getChildren().add( manguPind);

        GraphicsContext kontekst = manguPind.getGraphicsContext2D();

        Image seebiMull = new Image("bubble.png");

        final long startNanoTime = System.nanoTime();

        new AnimationTimer() {
            public void handle(long currentNanoTime){
                double t = (currentNanoTime - startNanoTime) / 1000000000.0;
                double y = 605 - (t*100);

                //Puhasta mängupind, et vanu kaadreid mitte näha (mullil tekkis kontuur)
                kontekst.clearRect(0,0,PINNA_LAIUS,PINNA_KORGUS);
                kontekst.drawImage(seebiMull, 250, y);
            }
        }.start();
        suurAken.show();

    }
}
