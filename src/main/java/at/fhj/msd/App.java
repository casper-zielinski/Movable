package at.fhj.msd;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       
        MovablePoint mv = new MovablePoint(3, 3, 2, 2);
        mv.moveDown();
        mv.moveLeft();
        System.out.println(mv.toString());
    }
}
