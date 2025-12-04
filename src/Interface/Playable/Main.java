package Interface.Playable;
interface Playable{
    void play();
}

class Football implements Playable{
    @Override
    public void play() {
        System.out.println("Football is being played");
    }
}

class Volleyball implements Playable{
    @Override
    public void play() {
        System.out.println("Volleyball is being played");
    }
}

class Basketball implements Playable{
    @Override
    public void play() {
        System.out.println("Basketball is being played");
    }
}

public class Main {
    public static void main(String[] args) {
        Football f = new Football();
        Basketball b = new Basketball();
        Volleyball v = new Volleyball();

        f.play();
        b.play();
        v.play();

    }
}
