import java.util.Scanner;

public class PetrolCalculatorDebug {
    public static void main(String[] args) {
        new PetrolCalculatorDebug().calculate();
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tipo de combustible: 1 — gasolina de 92 octanos, 2 — gasolina de 95 octanos, 3 — gasolina de 100 octanos => ");
        int petrolType = scanner.nextInt();
        System.out.print("Introduce el número de litros => ");
        double volume = scanner.nextDouble();
        System.out.print("Introduce un descuento en el rango de 0..100 => ");
        double discount = scanner.nextDouble() / 100;

        if (petrolType == 1) {
            Ai92Calculator calculator = new Ai92Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("El costo de " + volume + " litros de gasolina de 92 octanos es $" + price");
        } else if (petrolType == 2) {
            Ai95Calculator calculator = new Ai95Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("El costo de " + volume + " litros de gasolina de 95 octanos es $" + price");
        } else if (petrolType == 3) {
            Ai100Calculator calculator = new Ai100Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("El costo de " + volume + " litros de gasolina de 100 octanos es $" + price");
        }
    }
}

