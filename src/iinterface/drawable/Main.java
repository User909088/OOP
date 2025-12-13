//package iinterface.drawable;
//
//import javax.swing.*;
//import java.awt.*;
//
//// Interface
//interface Drawable {
//    void draw(Graphics g);
//}
//
//// Circle
//class Circle implements Drawable {
//    public void draw(Graphics g) {
//        g.setColor(Color.RED);
//        g.fillOval(100, 100, 200, 200);
//    }
//}
//
//// Rectangle
//class Rectangle implements Drawable {
//    public void draw(Graphics g) {
//        g.setColor(Color.BLUE);
//        g.fillRect(100, 100, 200, 200);
//    }
//}
//
//// Triangle
//class Triangle implements Drawable {
//    public void draw(Graphics g) {
//        g.setColor(Color.GREEN);
//
//        int[] x = {200, 100, 300};
//        int[] y = {100, 300, 300};
//
//        g.fillPolygon(x, y, 3);
//    }
//}
//
//// MAIN + Display
//public class Main {
//    public static void main(String[] args) {
//
//        // Choose which shapes to draw
//        Drawable[] shapes = {
//                new Circle(),
//                new Rectangle(),
//                new Triangle()
//        };
//
//        JFrame frame = new JFrame("Shapes");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 600);
//
//        JPanel panel = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//
//                // Draw all shapes here
//                for (Drawable shape : shapes) {
//                    shape.draw(g);
//                }
//            }
//        };
//
//        frame.add(panel);
//        frame.setVisible(true);
//    }
//}
