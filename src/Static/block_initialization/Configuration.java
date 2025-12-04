package Static.block_initialization;

public class Configuration {
    private static int next_id = 1;

    public static int getNext_id() {
        return next_id++;
    }

    public static void main(String[] args) {
        System.out.println("Id " + Configuration.getNext_id() );
        System.out.println("Id " + Configuration.getNext_id() );
        System.out.println("Id " + Configuration.getNext_id() );
        System.out.println("Id " + Configuration.getNext_id() );
    }
}
