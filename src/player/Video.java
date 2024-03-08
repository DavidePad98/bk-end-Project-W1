package player;

import interfaces.Playable;

public class Video extends ElementoMultimediale {
    private int luminosita;
    private int durata;
    private int volume;

    public Video(String title, int luminosita, int durata, int volume)  {
        super(title);
        this.luminosita = luminosita;
        this.durata = durata;
        this.volume = volume;
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitle() + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }




}
