package at.fhj.msd;

public class Robot extends Movable {
      int count = 0;
      int id;
      int x;
      int y;
      int stepStize;

      public Robot(int x, int y, int stepStize) {
            this.id = count++;
            this.x = x;
            this.y = y;
            this.stepStize = stepStize;
      }

      @Override
      public String toString() {
            return String.format("Robot #%s (%s, %s) \n", this.id, this.x, this.y);
      }

      @Override
      public void moveUp() {
            this.y += this.stepStize;
      }

      @Override
      public void moveDown() {
            this.y -= this.stepStize;
      }

      @Override
      public void moveRight() {
            this.x += this.stepStize;
      }

      @Override
      public void moveLeft() {
            this.x -= this.stepStize;
      }
}
