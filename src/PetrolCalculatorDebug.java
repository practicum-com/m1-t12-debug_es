import java.util.Scanner;

public class PetrolCalculatorDebug {
    public static void main(String[] args) {
        new PetrolCalculatorDebug().calculate();
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fuel type: 1 — 92 octane gas, 2 — 95 octane gas, 3 — 100 octane gas => ");
        int petrolType = scanner.nextInt();
        System.out.print("Enter the number of liters => ");
        double volume = scanner.nextDouble();
        System.out.print("Enter a discount in the range of 0..100 => ");
        double discount = scanner.nextDouble() / 100;

        if (petrolType == 1) {
            Ai92Calculator calculator = new Ai92Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("The price of " + volume + " liters of the 92 octane gas is " + price + "$");
        } else if (petrolType == 2) {
            Ai95Calculator calculator = new Ai95Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("The price of " + volume + " liters of the 95 octane gas is = " + price + "$");
        } else if (petrolType == 3) {
            Ai100Calculator calculator = new Ai100Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("The price of " + volume + " liters of the 100 octane gas is = " + price + "$");
        }
    }
}

