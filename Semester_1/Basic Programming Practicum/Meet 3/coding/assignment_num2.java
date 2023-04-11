import java.util.*;

public class assignment_num2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        float temperature, celcius, reamur, fahrenheit, kelvin;

        System.out.print("Input temperature : ");
        temperature = scanner.nextFloat();

        celcius = temperature;
        reamur = 0.8f * celcius;
        fahrenheit = 1.8f * celcius + 32;
        kelvin = celcius + 273;

        System.out.println("Temperature in celcius : " + celcius);
        System.out.println("Temperature in reamur : " + reamur);
        System.out.println("Temperature in fahrenheit : " + fahrenheit);
        System.out.println("Temperature IN kelvin : " + kelvin);



    }
}
