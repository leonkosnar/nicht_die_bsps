package at.ac.fhcampuswien.shape;

public class Rectangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private static int count;

    public static int getCount(){
        return count;
    }

    public Rectangle(int x1, int y1, int x2, int y2){
        count ++;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rectangle(int height, int width){
        count ++;
        this.x1 = this.y1 = 0;
        this.x2 = width;
        this.y2 = height;
    }

    public Rectangle(Rectangle rect){
        count ++;
        this.x1 = rect.x1;
        this.x2 = rect.x2;
        this.y1 = rect.y1;
        this.y2 = rect.y2;
    }

    public int getWidth(){
        return this.x2 - this.x1;
    }
    public int getHeight(){
        return this.y2 - this.y1;
    }

    public boolean isInside(int x, int y){
        return this.x1 <= x  && x <= this.x2 && this.y1 <= y  && x <= this.y2;
    }

    public boolean isInside(Rectangle rect){
        return isInside(rect.x1, rect.y1) && isInside(rect.x2, rect.y2);
    }

    @Override
    public String toString() {
        return String.format(":Rectangle P1(%d,%d) P2(%d,%d)", this.x1, this.y1, this.x2, this.y2);
    }

    public Rectangle union(Rectangle rect2){
        int x1 = rect2.x1 > this.x1 ? this.x1 : rect2.x1;
        int x2 = rect2.x2 < this.x2 ? this.x2 : rect2.x2;
        int y1 = rect2.y1 > this.y1 ? this.y1 : rect2.y1;
        int y2 = rect2.y2 < this.y2 ? this.y2 : rect2.y2;
        return new Rectangle(x1, y1, x2, y2);
    }

    public Rectangle intersection(Rectangle rect2){
        int x1 = rect2.x1 < this.x1 ? this.x1 : rect2.x1;
        int x2 = rect2.x2 > this.x2 ? this.x2 : rect2.x2;
        int y1 = rect2.y1 < this.y1 ? this.y1 : rect2.y1;
        int y2 = rect2.y2 > this.y2 ? this.y2 : rect2.y2;

        if(x1 >= x2 || y1 >= y2) return null;

        return new Rectangle(x1, y1, x2, y2);
    }

}
// IN APP
public static void main(String[] args) {

  }
  public static Rectangle[] generateRectangles(int i){
      Rectangle[] arr = new Rectangle[i];
      for(int a = 0; a < i; a++){
          arr[a] = new Rectangle(0, 0, 0, 0);
      }
      return arr;
  }
