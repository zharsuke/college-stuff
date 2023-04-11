public class PacMan {
    int x, y, width, height;
    PacMan() {

    }   
    PacMan(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    } 
    void moveLeft() {
        if (x >= 0 && x <= width) {
            x--;
        } else {
            System.out.println("cannot move!");
        }
    }
    void moveRight() {
        if (x >= 0 && x <= width) {
            x++;
        } else {
            System.out.println("cannot move!");
        }
    }
    void moveUp() {
        if (y >= 0 && y <= height) {
            y--;
        } else {
            System.out.println("cannot move!");
        }
    }
    void moveDown() {
        if (y >= 0 && y <= height) {
            y++;
        } else {
            System.out.println("cannot move!");
        }
    }
    void printPosition() {
        System.out.println("Height = " + height);
        System.out.println("width = " + width);
        System.out.println("Coordinate pacman = (" + x + "," + y + ")");
    }
}
