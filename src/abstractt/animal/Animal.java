package abstractt.animal;

abstract class Sound{
   public abstract void sound();
}

class Lion extends Sound{
    @Override
    public void sound() {
        System.out.println("ROAAARRR–GHRRR–ROAAARRR–GHRR");
    }
}

class Tiger extends Sound{
    @Override
    public void sound() {
        System.out.println("RAAARGH!");
    }
}

public class Animal {
    public static void main(String[] args) {
        Sound l = new Lion();
        l.sound();
        Sound t = new Tiger();
        t.sound();
    }
}
