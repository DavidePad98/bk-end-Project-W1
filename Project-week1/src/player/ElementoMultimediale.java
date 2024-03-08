package player;

public abstract class ElementoMultimediale {
protected String title;

public ElementoMultimediale(String title){
    this.title=title;
}

    public String getTitle() {
        return title;
    }

    public abstract void play();
}
