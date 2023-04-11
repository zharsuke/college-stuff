public class App {
    public static void main(String[] args) throws Exception {
        PacMan pacMan = new PacMan();
        pacMan.height = 500;
        pacMan.width = 400;
        pacMan.x = 0;
        pacMan.y = 0;
        System.out.println("Before move");
        pacMan.printPosition();
        System.out.println();
        System.out.println("After move");
        pacMan.moveRight();
        pacMan.printPosition();
    }
}
