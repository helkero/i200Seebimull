import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * Created by helkero on 27/12/2016.
 */
public class Seebimull {
    private int algusX;
    private int algusY;
    private int suurus;
    private int kiirus;
    private Image mulliPilt;
    private GraphicsContext joonistusKontekst;

    public Seebimull(int x, int y, int size, int speed, Image pilt, GraphicsContext joonistus){
        this.algusX = x;
        this.algusY = y;
        if (size < 60){
            this.suurus = 40;
        }
        else {
            this.suurus = size;
        }
        this.kiirus = speed;
        this.mulliPilt = pilt;
        this.joonistusKontekst = joonistus;
        System.out.println("Olen mull ja olen olemas!!!");

    }

    public void JoonistaMull(){
        this.joonistusKontekst.drawImage(this.mulliPilt, this.algusX, this.algusY, this.suurus, this.suurus);
    }

    public void ArvutaUusAsukoht(){
        this.algusY = this.algusY-1;

    }

}
