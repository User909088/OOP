package constructor.overloading_dt;

public class Point {
        private int x;
        private int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public Point(double x, double y){
            this.x = (int) x;
            this.y = (int) y;
        }
    public void point(){
        System.out.println("Coordinates: " + x + " , " + y );
    }
    public static void main(String[] args) {
        Point first = new Point(4.5, 6);
        first.point();

        Point sec = new Point(4.5 , 7.5 );
        sec.point();
    }
}
