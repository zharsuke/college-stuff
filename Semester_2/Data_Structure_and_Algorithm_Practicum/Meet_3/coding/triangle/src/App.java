public class App {
    public static void main(String[] args) throws Exception {
        Triangle [] trArray = new Triangle[4];
        trArray[0] = new Triangle(10, 4);
        trArray[1] = new Triangle(20, 10);
        trArray[2] = new Triangle(15, 6);
        trArray[3] = new Triangle(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println(i + "th trArray base : " + trArray[i].base + ", height : " + trArray[i].height);
        }
        System.out.println();
        for (int i = 0; i < trArray.length; i++) {
            System.out.println(i + "th trArray area : " + trArray[i].countArea(trArray[i].base, trArray[i].height) + 
            ", perimeter : " + trArray[i].countPerimeter(trArray[i].base, trArray[i].height));            
        }
    }
}
