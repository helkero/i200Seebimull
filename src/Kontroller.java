import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by helkero on 27/12/2016.
 */
public class Kontroller {

    public int elud = 3;
    public int punktid = 0;
    public int mulliKiirus = 1;
    public int mullideArv = 0;
    private GraphicsContext joonistus;
    private Image mulliPilt;
    private List<Seebimull> koikMullid = new ArrayList<>();
    Random suvaline = new Random();

    public Kontroller(GraphicsContext joonistus,Image mulliPilt) {
        this.joonistus = joonistus;
        this.mulliPilt = mulliPilt;
    }

    public void TekitaMull (){
        if (mullideArv < 100) {
            mullideArv = mullideArv + 1;
            Seebimull mull = new Seebimull(suvaline.nextInt(800),suvaline.nextInt(800), suvaline.nextInt(100), mulliKiirus, mulliPilt, joonistus);
            koikMullid.add(mull);
        }
    }
    public void JoonistaMullid(){
        for(Seebimull mull : koikMullid){
            mull.JoonistaMull();
        }
    }

    public void ArvutaMullideUusAsukoht(){
        for(Seebimull mull : koikMullid){
            mull.ArvutaUusAsukoht();
        }
    }

}
