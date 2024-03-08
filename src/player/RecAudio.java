package player;

public class RecAudio extends ElementoMultimediale{
    private int durata;
    private int volume;

    public RecAudio(String title, int durata, int volume) {
        super(title);
        this.durata = durata;
        this.volume= volume;
    }

    public int getDurata() {
        return durata;
    }

   @Override
    public void play(){
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitle() + " " + "!".repeat(volume));
        }
    }

    public void VolumeUp(){
        volume++;
    }
    public void VolumeDown(){
        volume--;
    }
}
