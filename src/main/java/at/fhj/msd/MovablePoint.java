package at.fhj.msd;

public class MovablePoint extends Movable{
      private int x;
      private int y;
      private int xSpeed;
      private int ySpeed;

      public MovablePoint(int x, int y, int xSpeed, int ySpeed)
      {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
      }

      @Override
      public String toString()
      {
            return String.format("(%s, %s) speed = (%s, %s) \n", this.x, this.y, this.xSpeed, this.ySpeed);
      }

      @Override
      public void moveUp() {
            this.y += this.ySpeed;
      }

      @Override
      public void moveDown() {
            this.y -= this.ySpeed;
      }

      @Override
      public void moveLeft() {
            this.x -= this.xSpeed;
      }

      @Override
      public void moveRight() {
            this.x += this.xSpeed;
      }


}
