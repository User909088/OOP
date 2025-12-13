package inheritance.animal_0;
//super
//cecil
class Animal{
    public void move(){
        System.out.println("Move");
    }

}

//child

class Cheetah extends Animal{
    @Override
    public void move() {
        System.out.println("Cheetah is running");
    }
}



public class Action {
    public static void main(String[] args) {
  Cheetah ch = new Cheetah();
  ch.move();

    }
}
