package Abstract.Animal;

abstract class Animal{
   public abstract void sound();
}

class Lion extends Animal{
    @Override
    public void sound() {
        System.out.println("ROAAARRR–GHRRR–ROAAARRR–GHRR");
    }
}

class Tiger extends Animal{
    @Override
    public void sound() {
        System.out.println("RAAARGH!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal l = new Lion();
        l.sound();
        Animal t = new Tiger();
        t.sound();
    }
}
