package player;

public class Immagine extends ElementoMultimediale{
private int luminosita;
public Immagine(String title, int luminosita){
    super(title);
    this.luminosita = luminosita;

}

    @Override
    public void play() {

    }
    @Override
    public void show(){
    for (int i = 0; i < luminosita; i++) {
        System.out.println(getTitle() + " " + "*".repeat(luminosita));
    }
}

}
