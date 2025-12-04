package Abstract.Instrument;

//super

abstract class Instrument{
    public abstract void play();
    public abstract void tune();
}

//subclass

class Glockenspiel extends Instrument{
    @Override
    public void play() {
        System.out.println("Glockenspiel is being played: ");
    }

    @Override
    public void tune() {
        System.out.println("...ting-ting! ping-ping!");
    }
}

class Violin extends Instrument{
    @Override
    public void play() {
        System.out.println("Violin is being played: ");
    }

    @Override
    public void tune() {
        System.out.println("reeee-yaaah… sweeee-ohhh…");
    }
}
public class Main {
    public static void main(String[] args) {
        Instrument g = new Glockenspiel();
        Instrument v = new Violin();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        g.play();
        g.tune();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        v.play();
        v.tune();

    }
}
