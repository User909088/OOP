package abstractt.instrument;

//super

abstract class In{
    public abstract void play();
    public abstract void tune();
}

//subclass

class Glockenspiel extends In{
    @Override
    public void play() {
        System.out.println("Glockenspiel is being played: ");
    }

    @Override
    public void tune() {
        System.out.println("...ting-ting! ping-ping!");
    }
}

class Violin extends In{
    @Override
    public void play() {
        System.out.println("Violin is being played: ");
    }

    @Override
    public void tune() {
        System.out.println("reeee-yaaah… sweeee-ohhh…");
    }
}
public class Instrument{
    public static void main(String[] args) {
        In g = new Glockenspiel();
        In v = new Violin();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        g.play();
        g.tune();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        v.play();
        v.tune();

    }
}
