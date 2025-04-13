package at.fhj.msd;

public class Vehicle extends Movable{
      private String type;
      private int x;
      private int y;
      private int speed = 0;
      private int acceleration;
      private int deceleration;

      public Vehicle(String type, int x, int y, int speed, int acceleration, int deceleration) {
            this.type = type;
            this.x = x;
            this.y = y;
            this.speed = speed;
            this.acceleration = acceleration;
            this.deceleration = deceleration;

            if (speed < 0) {
                  this.speed = 0;
                  System.out.println("Speed cannot be negative. Setting speed to 0.");
            }
      }

      @Override
      public String toString() {
            return String.format("%s (%s, %s) speed = %s \n", this.type, this.x, this.y, this.speed);
      }

      @Override
      public void moveUp() {
            this.speed += this.acceleration;
            this.y += this.speed;
      }

      @Override
      public void moveDown() {
            this.speed -= this.deceleration;
            this.y += this.speed;
      }

      @Override
      public void moveLeft() {
            this.x += this.speed * 0.9;
      }

      @Override
      public void moveRight() {
            this.x -= this.speed * 0.9;
      }





}
